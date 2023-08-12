function preOrder(root) {
    const result = [];

    function traverse(node) {
        if (node === null) {
            return;
        }

        result.push(node.data); // Visit the current node
        traverse(node.left);   // Traverse the left subtree
        traverse(node.right);  // Traverse the right subtree
    }

    traverse(root);
    console.log(result.join(' '));
}