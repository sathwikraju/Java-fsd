// Creating a Map
const studentGrades = new Map();

// Adding data to the Map
studentGrades.set("Sathwik", 90);
studentGrades.set("Rajesh", 85);
studentGrades.set("Abhi", 78);

// Accessing data in the Map
console.log(studentGrades.get("Sathwik")); // Output: 90
console.log(studentGrades.get("Rajesh"));   // Output: 85

// Checking if a key exists in the Map
console.log(studentGrades.has("Abhi")); // Output: true
console.log(studentGrades.has("Bhargav")); // Output: false

// Deleting a key-value pair from the Map
studentGrades.delete("Rajesh");
console.log(studentGrades.has("Rajesh"));   // Output: false

// Creating a Class
class Person {
    constructor(name, age) {
        this.name = name;
        this.age = age;
    }

    greet() {
        console.log(`Hello, my name is ${this.name} and I am ${this.age} years old.`);
    }
}

// Creating instances of the Class
const person1 = new Person("Sathwik", 25);
const person2 = new Person("Rajesh", 30);

// Calling the Class method
person1.greet();
person2.greet();

// Verifying Class properties
console.log(person1.name); // Output: Alice
console.log(person2.age);  // Output: 30
