<<<<<<< HEAD


const user  = {
    name: "John Doe",
    age: 30,
    email: "john@mgila.com",
    showMsg: function() {
        window.alert("Hello " + this.name);
    },
    showMyAge: () => {
        window.alert("My age is " + this.age);
    }
}

user.showMyAge()

const numbres = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
const doubleNumbers = numbres.map((num) => num * 2);
console.log(doubleNumbers);
=======


const user  = {
    name: "John Doe",
    age: 30,
    email: "john@mgila.com",
    showMsg: function() {
        window.alert("Hello " + this.name);
    },
    showMyAge: () => {
        window.alert("My age is " + this.age);
    }
}

user.showMyAge()

const numbres = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
const doubleNumbers = numbres.map((num) => num * 2);
console.log(doubleNumbers);
>>>>>>> 544dd23736dc97bfe9552d9a462cdc9ba8a5ec12
