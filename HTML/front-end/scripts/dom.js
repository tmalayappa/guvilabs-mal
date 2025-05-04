const appDiv = document.getElementById("app"); // Document Object Modal

// setTimeout(()=>{
//     const divElements = document.querySelectorAll('h1')  // elementName, .className, #id
//     const colors = ['red', 'blue', 'green', 'yellow', 'purple', 'orange']
//     divElements.forEach((divElement, index) => {
//         divElement.style.background = "black"; // Change the color of the h1 elements to black
//         divElement.style.color = colors[index]; // Change the color of the h1 elements to the colors array
//     })

//     const divElement = document.querySelector('#box') // Select the first h1 element
//     divElement.style.color = "green"; // Change the color of the first h1 element to green
// }, 2000)

// createElement & appendChild
const newDiv = document.createElement("button"); // Create a new div element
newDiv.innerText = "show other content"; // Set the inner text of the new div
newDiv.style.color = "red"; // Set the color of the new div to red
newDiv.onclick = handleButtonClick;
appDiv.appendChild(newDiv); // Append the new div to the appDiv

let bgColor = "white";
function handleButtonClick() {
    if(bgColor === "white") {
        bgColor = "blue"; // Change the background color to blue
        appDiv.style.color = "white"; // Change the text color to white
    } else {
        bgColor = "white"; // Change the background color to white
        appDiv.style.color = "black"; // Change the text color to black
    }
    appDiv.style.backgroundColor = bgColor // Change the background color to blue
}

const handleH1Click = function () {
    alert('h1 clicked')
}