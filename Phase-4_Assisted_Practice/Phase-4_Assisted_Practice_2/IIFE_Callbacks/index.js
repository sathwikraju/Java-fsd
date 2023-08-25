// IIFE (Immediately Invoked Function Expression)
(function() {
    console.log("IIFE: This function is immediately invoked.");
})();

// Callback Example
function doSomethingAsync(callback) {
    setTimeout(function() {
        console.log("Async operation done.");
        callback();
    }, 2000);
}

function callbackFunction() {
    console.log("Callback function executed.");
}

doSomethingAsync(callbackFunction);

// Closure Example
function outerFunction(outerValue) {
    return function(innerValue) {
        console.log(`Outer value: ${outerValue}, Inner value: ${innerValue}`);
    };
}

const closureFunction = outerFunction("Hello");
closureFunction("World");

// Closure with Private Variable
function counter() {
    let count = 0;

    return function() {
        count++;
        console.log(`Count: ${count}`);
    };
}

const increment = counter();
increment();
increment();
