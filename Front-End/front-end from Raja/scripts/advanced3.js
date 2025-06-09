// old method
    console.log("Old method");
    fetch("https://jsonplaceholder.typicode.com/users")
    .then((result) => {
        return result.json()
    }).then(res=>{
        console.log("user Data", res);
    }).catch((error) => {
        console.error(error);
    });

    fetch("https://jsonplaceholder.typicode.com/photos")
    .then((result) => {
        return result.json()
    }).then(res=>{
        console.log("500 photos", res);
    }).catch((error) => {
        console.error(error);
    });


async function getData() {
    console.log("New method");
        // first call
    const userData = await fetch("https://jsonplaceholder.typicode.com/users"); // 180ms
    const userJson = await userData.json(); // 0
        // second call
    const photoData = await fetch("https://jsonplaceholder.typicode.com/photos");
    const photoJson = await photoData.json();

    return {
        userData: userJson,
        photoData: photoJson
    }
}
    getData().then(res=>{
        console.log("two api response", res);
    }).catch((error) => {
        console.error(error);
    });



// async vs sync // parralel execution and one by one exceution
// callback hell
// async await