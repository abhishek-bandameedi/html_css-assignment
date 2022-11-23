const menuItems='[{"name":"Chicken 65","price":349.00,"id":"item1","category":"starters"},{"name":"Mutton 65","price":399.00,"id":"item2","category":"starters"},{"name":"Appolo fish","price":399.00,"id":"item3","category":"starters"},{"name":"Prawns Manchurian","price":399.00,"id":"item4","category":"starters"},{"name":"Chicken Fry Pulao","price":319.00,"id":"item5","category":"biryani"},{"name":"Chicken special biryani","price":319.00,"id":"item6","category":"biryani"},{"name":"Chicken Dum Biryani","price":289.00,"id":"item7","category":"biryani"},{"name":"Butter Chicken","price":349.00,"id":"item8","category":"Main course"},{"name":"Kadai chicken","price":349.00,"id":"item9","category":"Main course"}]'

const foodMenu = document.querySelector(".food-menu")
const listOfItems = document.createElement('ul');
foodMenu.append(listOfItems);
// const url = "data.json";

// First row i.e template row in table
const tableHeadRow = document.createElement("tr");

const sNo = document.createElement("th");
sNo.textContent = "S.no";
sNo.setAttribute("id","sno");

const item = document.createElement("th");
item.textContent = "Item";

const price = document.createElement("th");
price.textContent = "Price";

const quantity = document.createElement("th")
quantity.textContent = "Quantity";

tableHeadRow.appendChild(sNo);
tableHeadRow.appendChild(item);
tableHeadRow.appendChild(price);
tableHeadRow.appendChild(quantity);

//Total containing row in bill window
let totalRow = document.createElement('tr');
let totalCol = document.createElement("td");
totalCol.colSpan = "4"
totalCol.style.textAlign = "center";
totalRow.appendChild(totalCol);

var dragged;
var index = 0;

var tableTotal = {"Table-1":0,"Table-2":0,"Table-3":0};
var tableData = {"Table-1":[],"Table-2":[],"Table-3":[]}


loadData();
function loadData(){
    var mydata=JSON.parse(menuItems);
    addToMenu(mydata);
}
function addToMenu(menuArray){
    menuArray.forEach(element => {
        // console.log(element);
        const itemName = document.createElement('h1');
        itemName.textContent = element.name;

        const price = document.createElement('p');
        price.textContent = element.price;

        const category = document.createElement("i");
        category.textContent = element.category;
        category.style.display="none";

        const foodItem = document.createElement('li');
        foodItem.draggable = "true";
        foodItem.setAttribute("id",element.id);

        foodItem.addEventListener("dragstart",(e) => {
            dragged = e.target;
            console.log("Drag start fired :" + e.target.id);
        });
        foodItem.addEventListener("dragend",() => {
            // e.dataTransfer.setData('text/plain', e.target.id);
            console.log("Dragend fired");
        });

        foodItem.appendChild(itemName);
        foodItem.appendChild(price);
        foodItem.appendChild(category);
        listOfItems.appendChild(foodItem);
    });
}

const tables = document.querySelector(".table-num");

const tablesList = tables.querySelectorAll("div");
tablesList.forEach(table => {
    table.addEventListener("dragover",(e) => {
        e.preventDefault();
        table.style.backgroundColor ="Wheat";
        console.log("dragover triggered");
    })
    table.addEventListener("dragleave",() =>{
        table.style.backgroundColor ="";
    })
    table.addEventListener("drop",(e)=> {
        table.style.backgroundColor =""
        console.log("drag dropped")
        let tableItemsAndPrice = table.querySelector("p");
        let tableIdentifier = table.querySelector("h1").textContent;
        let item = dragged.querySelector("h1").textContent;
        let price = dragged.querySelector("p").textContent; 
        // console.log(price);
        // console.log(item);
        let itemInfo = [item,price,1];
        // console.log(tableData[tableIdentifier].length)
        if(tableData[tableIdentifier].length === 0)
        {
            tableData[tableIdentifier].push(itemInfo);
            console.log(tableData[tableIdentifier]);
        }
        else{
            let changeOccuredFlag = false;
            for(let index in tableData[tableIdentifier]){ 
                if(itemInfo[0] === tableData[tableIdentifier][index][0]){
                    tableData[tableIdentifier][index][2]++;
                    changeOccuredFlag = true;
                    console.log(tableData[tableIdentifier][index]);
                }
            }
            if(!changeOccuredFlag)
            {
                tableData[tableIdentifier].push(itemInfo);
                console.log(tableData[tableIdentifier]);
            }
        }
        calculateTotal();
        console.log(tableTotal[tableIdentifier]);
        tableItemsAndPrice.textContent = `Rs.`+tableTotal[tableIdentifier]+" | Total items:"+tableData[tableIdentifier].length;
        console.log(tableItemsAndPrice.textContent);
    })
    function calculateTotal(){
        let tableIdentifier = table.querySelector("h1").textContent;
        let total = 0
        for(let eachItem of tableData[tableIdentifier])
        {
            total += eachItem[1]*eachItem[2]; 
        }
        tableTotal[tableIdentifier] = total;
    }
    table.addEventListener("click",() => {

        const tableIdentifier = table.querySelector("h1").textContent;

        //background after clicking is made orange 
        table.style.backgroundColor = "orange";

        const billWindowContainer = document.querySelector(".bill");
        const billWindow = document.querySelector(".bill-table");

        //overlay hides background when visiblity is made visible
        const overlay = document.querySelector(".overlay");
        overlay.style.visibility = "visible"; 

        //window heading
        const billWindowHeading = document.querySelector(".bill-head");

        const billWindowDescription = document.createTextNode(tableIdentifier +" | Order Details");
        const closeButton = document.createElement("button");
        closeButton.setAttribute("class","close-button")
        closeButton.textContent = "X";

        //adding elements to bill window heading
        billWindowHeading.append(billWindowDescription);
        billWindowHeading.appendChild(closeButton);

        addFoodItemsTemplate();

        addFoodItemsToBillWindow();
        updateTotalOnChange();

        changesOnClickingTrashButton();
        addFoodItemsTotal();
        closeButton.addEventListener("click", () => {
            overlay.style.visibility = "hidden";    
            table.style.backgroundColor = "";
            billWindowHeading.innerHTML = "";
            billWindow.innerHTML = "";
        });

        const clickableGenerateBill = document.getElementById("generate-bill");
        // clickableGenerateBill.setAttribute("class","reset-bill")
        clickableGenerateBill.addEventListener("click", () => {
            overlay.style.visibility = "hidden";
            table.style.backgroundColor = "";
            billWindowHeading.innerHTML = "";
            billWindow.innerHTML = "";
            alert("pay the total amount: Rs."+tableTotal[tableIdentifier])  
            console.log(tableData[tableIdentifier])
            tableData[tableIdentifier]=[];
            //tableData[tableIdentifier].splice(0,tableData[tableIdentifier].length);
            changeSno();
            calculateTotal();
            updateTotalOnChange();
            table.querySelector("p").textContent = `Rs.`+tableTotal[tableIdentifier]+" | Total items:"+tableData[tableIdentifier].length; 
        })
    
        function addFoodItemsToBillWindow(){
            for(let index = 0;index < tableData[tableIdentifier].length ; index++){
                const detailRow = document.createElement("tr");
                detailRow.setAttribute("id",tableIdentifier+"~"+index);
                const snoColumn = document.createElement("td");
                snoColumn.setAttribute("id",tableIdentifier+"sno"+index);
                const itemNameColumn  = document.createElement("td");
                const itemPriceColumn = document.createElement("td");
                const itemQuantityColumn = document.createElement("td");
                const itemRemoveColumn = document.createElement("td");
                snoColumn.textContent = index+1;
                itemNameColumn.textContent = tableData[tableIdentifier][index][0];
                itemPriceColumn.textContent = tableData[tableIdentifier][index][1];
                const inputQuantityOfItem = document.createElement("input");
                inputQuantityOfItem.setAttribute("id",tableIdentifier+"_"+index);
                inputQuantityOfItem.setAttribute("class","input-number");
                inputQuantityOfItem.type = "number";
                inputQuantityOfItem.min = 1;
                inputQuantityOfItem.value = tableData[tableIdentifier][index][2];
                itemQuantityColumn.appendChild(inputQuantityOfItem);
                const trashButton  = document.createElement("button");
                trashButton.setAttribute("id",tableIdentifier+"-"+index);
                trashButton.setAttribute("class","trash-button");
                itemRemoveColumn.appendChild(trashButton);
                detailRow.appendChild(snoColumn);
                detailRow.appendChild(itemNameColumn);
                detailRow.appendChild(itemPriceColumn);
                detailRow.appendChild(itemQuantityColumn);
                detailRow.appendChild(itemRemoveColumn);
                billWindow.appendChild(detailRow);
            }
        }
        function addFoodItemsTotal(){
            totalCol.textContent = "Total : ";
            totalCol.textContent+=tableTotal[tableIdentifier];
            billWindow.appendChild(totalCol);   
        }
        function updateTotalOnChange(){
            for(let index = 0;index < tableData[tableIdentifier].length;index++){
                let changable = document.getElementById(tableIdentifier+"_"+index);
                console.log(changable);
                changable.addEventListener("change", () => {
                    tableData[tableIdentifier][index][2] = Number(changable.value);
                    console.log(tableData[tableIdentifier][index]);
                    calculateTotal();
                    totalCol.textContent = "Total : ";
                    totalCol.textContent+=tableTotal[tableIdentifier];
                    table.querySelector("p").textContent = `Rs.`+tableTotal[tableIdentifier]+" | Total items:"+tableData[tableIdentifier].length;
                })
            }
        }
        function changesOnClickingTrashButton(){
            let dLength =  tableData[tableIdentifier].length;
            for(let index = 0;index < tableData[tableIdentifier].length; index++ ){
                let trashClickable = document.getElementById(tableIdentifier+"-"+index);
                let trashableRow = document.getElementById(tableIdentifier+"~"+index);
                console.log(trashClickable);
                trashClickable.addEventListener("click",() => {
                    trashableRow.remove();
                    console.log(tableData[tableIdentifier]);
                    console.log(tableData[tableIdentifier].length);
                    console.log(tableTotal[tableIdentifier])
                    tableData[tableIdentifier].splice(index,1);
                    index = 0;
                    billWindow.innerHTML = "";  
                    changeSno();
                    addFoodItemsTotal();
                    changesOnClickingTrashButton();
                    console.log(tableData[tableIdentifier].length);
                    console.log(tableData[tableIdentifier]);
                    calculateTotal();
                    console.log(tableTotal[tableIdentifier])
                    totalCol.textContent = "Total : ";
                    totalCol.textContent+=tableTotal[tableIdentifier];
                    table.querySelector("p").textContent = `Rs.`+tableTotal[tableIdentifier]+" | Total items:"+tableData[tableIdentifier].length;                    
                })
                updateTotalOnChange();
            }
        }

        function changeSno(start){
            addFoodItemsTemplate();
            addFoodItemsToBillWindow();
        }
        function addFoodItemsTemplate(){
            billWindow.appendChild(tableHeadRow);
        }
    });
})  

const menuSearch = document.querySelector(".menu-search")

menuSearch.addEventListener("keyup",() => {
    let items = document.querySelector(".food-menu");
    let listNames = items.querySelector("ul");
    let listContents = listNames.querySelectorAll("li");
    for(let index = 0 ;index < listContents.length; index++){
        let heading = listContents[index].querySelector('h1');
        let course = listContents[index].querySelector('i');
        if(heading){
            if(heading.textContent.toUpperCase().indexOf(menuSearch.value.toUpperCase()) > -1 || course.textContent.toUpperCase().indexOf(menuSearch.value.toUpperCase()) > -1){
                listContents[index].style.display = '';
            }
            else{
                listContents[index].style.display = "none";
            }
        }
    }
})
const tableSearchBar = document.querySelector('.table-search');

tableSearchBar.addEventListener('keyup',()=>{
    let tablesList = document.querySelector('.table-num');
    let allTables = tablesList.querySelectorAll('div');
    for (let table = 0; table < allTables.length; table++) {
        let heading = allTables[table].querySelector('h1');
        
        if(heading){
            if(heading.textContent.toUpperCase().indexOf(tableSearchBar.value.toUpperCase()) >-1){
                allTables[table].style.display = '';
            }
            else{
                allTables[table].style.display = "none";
            }
        }
    }
});