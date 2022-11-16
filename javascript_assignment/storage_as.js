const local=document.querySelector("#local");
const session=document.querySelector("#session");
const increase=document.querySelector("#increase");
const reduce=document.querySelector("#reduce");
const lclear=document.querySelector("#localclear");
const sclear=document.querySelector("#sessionclear");
let lcount=localStorage.getItem('count')||0;
let scount=sessionStorage.getItem('count')||0;

function setVal(){
    local.textContent=lcount;
    session.textContent=scount;
}
setVal();

increase.addEventListener('click',()=>{
    lcount++;
    scount++;
    localStorage.setItem('count',lcount);
    sessionStorage.setItem('count',scount);
    setVal();
});
reduce.addEventListener('click',()=>{
    lcount--;
    scount--;
    localStorage.setItem('count',lcount);
    sessionStorage.setItem('count',scount);
    setVal();
});

lclear.addEventListener('click',()=>{
    localStorage.clear();
    lcount=0;
    setVal();
});
sclear.addEventListener('click',()=>{
    sessionStorage.clear();
    scount=0;
    setVal();
});
