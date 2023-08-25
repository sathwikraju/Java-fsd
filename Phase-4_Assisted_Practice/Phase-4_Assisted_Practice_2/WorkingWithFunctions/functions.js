// Function to add two numbers
function add(a, b) {
    return a + b;
}

// Function to subtract two numbers
function subtract(a, b) {
    return a - b;
}

// Function to multiply two numbers
function multiply(a, b) {
    return a * b;
}

// Function to divide two numbers
function divide(a, b) {
    if (b === 0) {
        throw new Error("Cannot divide by zero");
    }
    return a / b;
}

// Assertion function to verify expected and actual results
function assert(actual, expected, message) {
    if (actual === expected) {
        console.log(`Assertion Passed: ${message}`);
    } else {
        console.error(`Assertion Failed: ${message}. Expected ${expected}, but got ${actual}`);
    }
}

// Testing the functions
assert(add(2, 3), 5, "Addition should return 5");
assert(subtract(5, 2), 3, "Subtraction should return 3");
assert(multiply(3, 4), 12, "Multiplication should return 12");
assert(divide(10, 2), 5, "Division should return 5");
assert(divide(10, 0), NaN, "Division by zero should return NaN");

