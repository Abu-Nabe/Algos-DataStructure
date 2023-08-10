function processData(input) {
     //Enter your code here
    // 1 is to append string to the end of current string
    // 2 delete the last k chracter of string
    // 3 print the k'th character of string
    // 4 undo the last operation of 1/2
    const lines = input.split('\n');
    const q = parseInt(lines[0]);
    const queries = [];

    for (let i = 1; i <= q; i++) {
        queries.push(lines[i].split(' '));
    }

    let text = '';
    const stack = [];

    for (const query of queries) {
        const [type, value] = query;

        if (type === '1') {
            stack.push(text);
            text += value;
        } else if (type === '2') {
            stack.push(text);
            text = text.slice(0, -parseInt(value));
        } else if (type === '3') {
            console.log(text.charAt(parseInt(value) - 1));
        } else if (type === '4') {
            text = stack.pop();
        }
    }
}