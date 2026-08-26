// Immediate Invoked Function Expression (IIFE)

(function chai(){
    //named iffe
    console.log("DB connected");
    
})();

((name) => {
    console.log(`Database connected,${name}`);
})("Priyanshu")
