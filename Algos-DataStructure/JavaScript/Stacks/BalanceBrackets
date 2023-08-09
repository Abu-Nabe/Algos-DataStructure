/** @format */

function isBalanced(s) {
    let stack = [];
    const bracketPairs = {
        "(": ")",
        "[": "]",
        "{": "}",
    };

    for (let bracket of s) {
            if (bracket === "(" || bracket === "[" || bracket === "  {") {
            stack.push(bracket);
            } else {
            if (stack.length === 0 || bracketPairs[stack.pop()] !== bracket) {
                return "NO";
            }
        }
    }

    if (stack.length === 0) {
        return "YES";
    } else {
        return "NO";
    }
}
