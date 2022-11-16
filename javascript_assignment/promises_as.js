
function getData(uId) {
    return Promise = new Promise((resolve,reject)=>{
        setTimeout(()=>{
            if(uId=="skc"){
                console.log("Fetched the data!");
                resolve("skc@gmail.com");
            }
            else{
                reject("error");
            }
        },4000);
    })
}
console.log("start");
var email = getData("skc");
email.then((email)=>{
    console.log("Email id of the user id is: " + email);
})
.catch((error)=>{
    console.log(error);
})
console.log("end");