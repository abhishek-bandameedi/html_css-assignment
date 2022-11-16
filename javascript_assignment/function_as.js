//assignment question1
//Write a program to demonstrate how a function can be passed as a parameter to another function.
function print_name(name){
    console.log(name)
}
function greet(print_name){
    console.log("hello "+print_name)
}
greet("intern")

//assignment question2
//An arrow function takes two arguments firstName and lastName and returns a 2 letter string that represents the first letter of both the arguments. For the arguments Roger and Waters, the function returns ‘RW’. Write this function.
let arrow=(firstName,lastName)=>{
    console.log(firstName[0]+lastName[0])
}
arrow("Roger","Waters") 