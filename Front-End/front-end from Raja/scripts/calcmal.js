<<<<<<< HEAD
const display = document.getElementById('display');
let currentInput = '';
let operator = null;
let previousValue = null;

function updateDisplay(value) {
    if (display.value === '0' && value !== '.' && isNaN(parseInt(value))) {
        return; // Prevent leading zero followed by operator
    }
    if (operator && currentInput === '' && isNaN(parseInt(value))) {
        return; // Prevent operator after operator without a number
    }
    if (value === '.' && currentInput.includes('.')) {
        return; // Prevent multiple decimal points
    }
    currentInput += value;
    display.value = currentInput;
}

function setOperator(newOperator) {
    if (currentInput === '' && previousValue === null) return; // No operation yet

    if (previousValue !== null) {
        calculate();
    }

    previousValue = parseFloat(currentInput);
    operator = newOperator;
    currentInput = '';
}

function calculate() {
    if (operator === null || previousValue === null || currentInput === '') return;

    let result;
    const currentValue = parseFloat(currentInput);

    switch (operator) {
        case '+':
            result = previousValue + currentValue;
            break;
        case '-':
            result = previousValue - currentValue;
            break;
        case '*':
            result = previousValue * currentValue;
            break;
        case '/':
            if (currentValue === 0) {
                display.value = 'Error: Division by zero';
                resetCalculator();
                return;
            }
            result = previousValue / currentValue;
            break;
        default:
            return;
    }

    display.value = result;
    currentInput = String(result);
    operator = null;
    previousValue = null;
}

function clearDisplay() {
    display.value = '0';
    currentInput = '';
    operator = null;
    previousValue = null;
}

function handleDecimal() {
    if (!currentInput.includes('.')) {
        currentInput += '.';
        display.value = currentInput;
    }
}
=======
const display = document.getElementById('display');
let currentInput = '';
let operator = null;
let previousValue = null;

function updateDisplay(value) {
    if (display.value === '0' && value !== '.' && isNaN(parseInt(value))) {
        return; // Prevent leading zero followed by operator
    }
    if (operator && currentInput === '' && isNaN(parseInt(value))) {
        return; // Prevent operator after operator without a number
    }
    if (value === '.' && currentInput.includes('.')) {
        return; // Prevent multiple decimal points
    }
    currentInput += value;
    display.value = currentInput;
}

function setOperator(newOperator) {
    if (currentInput === '' && previousValue === null) return; // No operation yet

    if (previousValue !== null) {
        calculate();
    }

    previousValue = parseFloat(currentInput);
    operator = newOperator;
    currentInput = '';
}

function calculate() {
    if (operator === null || previousValue === null || currentInput === '') return;

    let result;
    const currentValue = parseFloat(currentInput);

    switch (operator) {
        case '+':
            result = previousValue + currentValue;
            break;
        case '-':
            result = previousValue - currentValue;
            break;
        case '*':
            result = previousValue * currentValue;
            break;
        case '/':
            if (currentValue === 0) {
                display.value = 'Error: Division by zero';
                resetCalculator();
                return;
            }
            result = previousValue / currentValue;
            break;
        default:
            return;
    }

    display.value = result;
    currentInput = String(result);
    operator = null;
    previousValue = null;
}

function clearDisplay() {
    display.value = '0';
    currentInput = '';
    operator = null;
    previousValue = null;
}

function handleDecimal() {
    if (!currentInput.includes('.')) {
        currentInput += '.';
        display.value = currentInput;
    }
}
>>>>>>> 544dd23736dc97bfe9552d9a462cdc9ba8a5ec12
