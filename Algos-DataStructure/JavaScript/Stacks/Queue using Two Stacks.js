function processData(input) {
    const lines = input.split('\n');
    const q = parseInt(lines[0]);
    const s1 = [];
    const s2 = [];

    for (let i = 1; i <= q; i++) {
        const query = lines[i].split(' ');
        const type = parseInt(query[0]);

        if (type === 1) {
            const x = parseInt(query[1]);
            s1.push(x);
        } else if (type === 2) {
            if (s2.length === 0) {
                while (s1.length > 0) {
                    s2.push(s1.pop());
                }
            }
            s2.pop();
        } else if (type === 3) {
            if (s2.length === 0) {
                while (s1.length > 0) {
                    s2.push(s1.pop());
                }
            }
            console.log(s2[s2.length - 1]);
        }
    }
}

// Example usage
const input = '6\n1 42\n2\n1 14\n3\n1 28\n3';