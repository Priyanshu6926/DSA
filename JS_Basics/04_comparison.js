/*
 * ============================================================================
 * TOPIC: JavaScript Comparison Operators & Strict Equality
 * FILE: 04_comparison.js
 * ============================================================================
 * 
 * DESCRIPTION:
 * Comparisons between different data types (type coercion) vs strict 
 * equality operator (`===`) which checks both value and data type.
 * 
 * EXPECTED OUTPUT:
 * false
 * false
 * true
 * false
 * false
 * false
 * false
 */

// Equality check == converts null to number (0) in relational operators (<, >, <=, >=)
// but NOT in loose equality (==).
console.log(null > 0);  // false
console.log(null == 0); // false
console.log(null >= 0); // true

console.log(undefined == 0); // false
console.log(undefined > 0);  // false
console.log(undefined < 0);  // false

// Strict equality `===` checks type without coercion:
console.log("2" === 2); // false
