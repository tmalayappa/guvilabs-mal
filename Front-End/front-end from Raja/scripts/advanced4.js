    async function getData() {
        // first call
        const getApiResponse = await fetch("http://localhost:8080/get-api", {
        method: "GET",
    }); // 180ms
    const getApiData = await getApiResponse.json(); // 0

    const postApiResponse = await fetch("http://localhost:8080/post-api", {
        method: "POST",
        body: JSON.stringify({
            name: "John Doe",
            age: 30,
        }),
        headers: { "Content-Type": "application/json"},
    }); // 200ms
    const postApiData = await postApiResponse.json();

    return { getApiData,  postApiData};
}


getData().then(res=>{
    console.log("two api response", res);
}).catch((error) => {
    console.error(error);
});

// async vs sync // parralel execution and one by one exceution
// callback hell
// async await
// async await
// list of request method & its use

// GET to get data from server
// POST to send data to server
// PUT to update data on server
// DELETE to delete data from server
// PATCH to partially update data on server