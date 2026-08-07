/*
 * ============================================================================
 * TOPIC: JavaScript Variables & Scope
 * FILE: 01_basics.js
 * ============================================================================
 * 
 * DESCRIPTION:
 * Demonstrating variable declarations using `const`, `let`, and legacy `var`.
 * Explains block scope vs functional scope and `console.table()`.
 * 
 * EXPECTED OUTPUT:
 * 144553
 * Table containing account values.
 */

const accountId = 144553;
let accountEmail = "hitesh@google.com";
var accountPassword = "12345";
accountCity = "Jaipur";
let accountState;

// accountId = 2 // TypeError: Assignment to constant variable.

accountEmail = "hc@hc.com";
accountPassword = "21212121";
accountCity = "Bengaluru";

console.log("Account ID:", accountId);

/*
 * Note on `var`:
 * Prefer NOT to use `var` due to scope hoisting issues across block scopes ({}) 
 * and function scopes. Always prefer `const` by default, and `let` for reassignable variables.
 */

console.table([accountId, accountEmail, accountPassword, accountCity, accountState]);
