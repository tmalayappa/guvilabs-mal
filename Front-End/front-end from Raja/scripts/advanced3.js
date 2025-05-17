
async function getData() {
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

    getData().then(res=>{
    console.log("two api response", res);

    });



// async vs sync // parralel execution and one by one exceution
// callback hell
// async await