/*
 * ============================================================================
 * TOPIC: JavaScript Type Conversion & Operators
 * FILE: 03_convoperations.js
 * ============================================================================
 * 
 * DESCRIPTION:
 * Explicit type conversions using Number(), String(), Boolean() constructors 
 * and string concatenation coercion rules in JavaScript.
 * 
 * EXPECTED OUTPUT:
 * number
 * NaN
 */

let score = "hitesh";

let valueInNumber = Number(score);
console.log(typeof valueInNumber); // number
console.log(valueInNumber);       // NaN (Not a Number)

// Type Conversion Reference Rules:
// "33" => 33
// "33abc" => NaN
// true => 1; false => 0

let isLoggedIn = "hitesh";
let booleanIsLoggedIn = Boolean(isLoggedIn);

// Boolean Conversions:
// 1 => true; 0 => false
// "" => false
// "hitesh" => true

let someNumber = 33;
let stringNumber = String(someNumber);

// *********************** Arithmetic Operations ***********************

let value = 3;
let negValue = -value;

let str1 = "hello";
let str2 = " hitesh";
let str3 = str1 + str2;

// Coercion precedence rules:
// "1" + 2 => "12"
// 1 + "2" => "12"
// "1" + 2 + 2 => "122"
// 1 + 2 + "2" => "32"
