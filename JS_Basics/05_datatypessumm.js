/*
 * ============================================================================
 * TOPIC: Primitive vs Non-Primitive & Memory Allocation (Stack vs Heap)
 * FILE: 05_datatypessumm.js
 * ============================================================================
 * 
 * DESCRIPTION:
 * Detailed overview of JavaScript memory allocation:
 * - Stack Memory: Used for Primitive types (Call-by-Value / Copies created).
 * - Heap Memory: Used for Non-Primitive / Reference types (Call-by-Reference).
 * 
 * EXPECTED OUTPUT:
 * false (id === anotherId)
 * symbol
 * Priyanshu
 * ChaiAurCode
 * user@changemail.com
 * user@changemail.com
 */

// 1. Primitive Types (Stack): String, Number, Boolean, null, undefined, Symbol, BigInt
const score = 100;
const scoreValue = 100.3;
const isLoggedIn = false;
const outsideTemp = null;
let userEmail;

const id = Symbol('123');
const anotherId = Symbol('123');
console.log(id === anotherId); // false (Symbols generate unique references)

// 2. Non-Primitive / Reference Types (Heap): Array, Objects, Functions
const heros = ["shaktiman", "naagraj", "doga"];
let myObj = {
    name: "hitesh",
    age: 22,
};
const myFunction = function() {
    System.out.println("Hello world");
};

console.log(typeof anotherId); // symbol

// ==========================================
// Memory Demonstration: Stack vs Heap
// ==========================================

// Stack (Primitive copy)
let myYtName = "Priyanshu";
let anotherName = myYtName;
anotherName = "ChaiAurCode";

console.log(myYtName);   // Priyanshu (Original unchanged)
console.log(anotherName); // ChaiAurCode

// Heap (Reference sharing)
let userOne = {
    email: "user@google.com",
    upi: "user@ybl"
};

let userTwo = userOne; // Points to same heap memory reference
userTwo.email = "user@changemail.com";

console.log(userOne.email); // user@changemail.com (Mutated via userTwo pointer)
console.log(userTwo.email); // user@changemail.com
