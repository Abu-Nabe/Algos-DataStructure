 var wordBreak = (s, wordDict) => {
    const wordSet = new Set(wordDict);/* Time O(N)   | Space O(N) */

    return canBreak(s, wordSet);      /* Time O(2^N) | Space O(N) */
};

var canBreak = (s, wordSet, start = 0) => {
    const isBaseCase = (start === s.length);
    if (isBaseCase) return true;

    return dfs(s, wordSet, start);/* Time O(2^N) | Space O(N) */
}

var dfs = (s, wordSet, start) => {
    for (let end = (start + 1); end <= s.length; end++) {/* Time O(N) */
        const word = s.slice(start, end);                    /* Time O(N)   | Space O(N) */

        const _canBreak = wordSet.has(word)
            && canBreak(s, wordSet, end);                    /* Time O(2^N) | Space O(N) */
        if (_canBreak) return true;
    }

    return false;
}