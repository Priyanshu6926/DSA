"use strict"; // Treat all JS code as newer ES6+ version

/*
 * ============================================================================
 * TOPIC: JavaScript Primitive Data Types & typeof Operator
 * FILE: 02_datatypes.js
 * ============================================================================
 * 
 * DESCRIPTION:
 * Overview of standard primitive types in JavaScript:
 * number (up to 2^53 - 1), bigint, string, boolean, null, undefined, symbol.
 * Demonstrates historical quirk: `typeof null === "object"`.
 * 
 * EXPECTED OUTPUT:
 * 6
 * Hitesh
 * undefined
 * object
 */

// alert( 3 + 3) // Running in Node.js environment, not browser DOM

console.log(3 + 3); // Maintain high code readability

console.log("Hitesh");

let name = "hitesh";
let age = 18;
let isLoggedIn = false;
let state;

// Primitive Data Types:
// number => 2^53 - 1 range
// bigint => arbitrary precision integers
// string => ""
// boolean => true / false
// null => standalone empty value
// undefined => unassigned variable state
// symbol => unique immutable identifier

// Non-Primitive Data Types:
// object

console.log(typeof undefined); // undefined
console.log(typeof null);      // object (historical JS bug)
