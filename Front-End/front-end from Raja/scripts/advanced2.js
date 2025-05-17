function test() {
    try {
        let a = 10;
        let b = 20;
        return a + b;   // if any acident happens in the code, it will be caught in the catch block 
    } catch (error) {
        return "Error: Something went wrong";
    }
}
console.log("response of normal function calling", test());


function test2 () {
    return new Promise((resolve, reject) => {
        let a = 10;
        let b = 20;
        if((a+b) > 100) {
            reject("Error: Sum is greater than 100");
        } else {
            resolve("Success: Sum is less than 100");
        }
    });
}

test2()
    .then((result) => {
        console.log("response of promise function calling", result);
    })
    .catch((error) => {
        console.error(error);
    });


async function test3() {
    //throw new Error("Error: Something went wrong"); // rejected value
    return 10; // resolved value
}

test3()
.then((result) => {
    console.log("response of async function calling", result);
}).catch((error) => {
    console.error(error);
})



// async vs syncronousfunction test() {
    try {
        let a = 10;
        let b = 20;
        return a + b;   // if any acident happens in the code, it will be caught in the catch block 
    } catch (error) {
        return "Error: Something went wrong";
    }

console.log("response of normal function calling", test());


function test2 () {
    return new Promise((resolve, reject) => {
        let a = 10;
        let b = 20;
        if((a+b) > 100) {
            reject("Error: Sum is greater than 100");
        } else {
            resolve("Success: Sum is less than 100");
        }
    });
}

test2()
    .then((result) => {
        console.log("response of promise function calling", result);
    })
    .catch((error) => {
        console.error(error);
    });


async function test3() {
    //throw new Error("Error: Something went wrong"); // rejected value
    return 10; // resolved value
}

test3()
.then((result) => {
    console.log("response of async function calling", result);
}).catch((error) => {
    console.error(error);
})



// async vs syncronous