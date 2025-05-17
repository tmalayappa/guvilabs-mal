let a = 0;
let b = 6;
const result = b / a; // file read or write
if(result === Infinity) throw new Error('test')
try {
	const result = b / a; // file read or write
	if(result === Infinity) throw new Error('test')
} catch(e) {
	console.error("error happened", e.message)
} finally {
	console.log("execute finally")
}

console.log('hello');
// =======================================