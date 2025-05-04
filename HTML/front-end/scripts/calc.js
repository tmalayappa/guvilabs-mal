function updateDisplay(value) {
    const display = document.getElementById('display'); 
    display.value = display.value + value;
}

function calculate() {
    const display = document.getElementById('display');
    display.value = eval(display.value);
}

function clearDisplay() {
    const display = document.getElementById('display');
    displayValue = "0";
    display.value = displayValue;
}
