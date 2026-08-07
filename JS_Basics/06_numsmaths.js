/*
 * ============================================================================
 * TOPIC: Numbers & Math Object in JavaScript
 * FILE: 06_numsmaths.js
 * ============================================================================
 * 
 * DESCRIPTION:
 * Number formatting methods (`toFixed`, `toPrecision`, `toLocaleString`) and 
 * Math methods (`Math.random()`, `Math.floor()`, `Math.ceil()`, `Math.abs()`).
 * Formula for generating random integers in a custom range [min, max]:
 * Math.floor(Math.random() * (max - min + 1)) + min
 */

const score = 400;
const balance = new Number(100);

const otherNumber = 123.8966;
const hundreds = 1000000;
// console.log(hundreds.toLocaleString('en-IN')); // "10,00,00"

// Math Methods
console.log(Math.random()); // Random float between 0 and 1
console.log((Math.random() * 10) + 1);
console.log(Math.floor(Math.random() * 10) + 1);

// Formula for Random Number between min (inclusive) and max (inclusive):
const min = 10;
const max = 20;

console.log(Math.floor(Math.random() * (max - min + 1)) + min);
