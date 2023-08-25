// Constructor function for creating Person objects
function Person(name, age) {
    this.name = name;
    this.age = age;
}

// Adding a method to the Person prototype
Person.prototype.greet = function() {
    console.log(`Hello, my name is ${this.name} and I am ${this.age} years old.`);
};

// Creating instances of Person
const person1 = new Person('Alice', 30);
const person2 = new Person('Bob', 25);

// Calling the greet method on the instances
person1.greet(); // Output: Hello, my name is Alice and I am 30 years old.
person2.greet(); // Output: Hello, my name is Bob and I am 25 years old.

// Creating a subclass using inheritance
function Student(name, age, grade) {
    // Call the parent constructor using "call"
    Person.call(this, name, age);
    this.grade = grade;
}

// Inherit the Person prototype methods
Student.prototype = Object.create(Person.prototype);

// Add a method specific to Student
Student.prototype.displayGrade = function() {
    console.log(`I am a student in grade ${this.grade}.`);
};

// Creating an instance of Student
const student = new Student('Charlie', 18, 12);

// Calling methods on the Student instance
student.greet(); // Output: Hello, my name is Charlie and I am 18 years old.
student.displayGrade(); // Output: I am a student in grade 12.
