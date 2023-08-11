class MinHeap {
    constructor() {
        this.heap = [];
    }

    push(value) {
        this.heap.push(value);
        this.bubbleUp(this.heap.length - 1);
    }

    pop() {
        if (this.isEmpty()) {
            return null;
        }
        if (this.heap.length === 1) {
            return this.heap.pop();
        }

        const root = this.heap[0];
        this.heap[0] = this.heap.pop();
        this.bubbleDown(0);
        return root;
    }

    isEmpty() {
        return this.heap.length === 0;
    }

    bubbleUp(index) {
        const parentIndex = Math.floor((index - 1) / 2);
        if (parentIndex >= 0 && this.heap[index] < this.heap[parentIndex]) {
            [this.heap[index], this.heap[parentIndex]] = [this.heap[parentIndex], this.heap[index]];
            this.bubbleUp(parentIndex);
        }
    }

    bubbleDown(index) {
        const leftChild = index * 2 + 1;
        const rightChild = index * 2 + 2;
        let smallest = index;

        if (leftChild < this.heap.length && this.heap[leftChild] < this.heap[smallest]) {
            smallest = leftChild;
        }
        if (rightChild < this.heap.length && this.heap[rightChild] < this.heap[smallest]) {z
            smallest = rightChild;
        }

        if (smallest !== index) {
            [this.heap[index], this.heap[smallest]] = [this.heap[smallest], this.heap[index]];
            this.bubbleDown(smallest);
        }
    }
}

function cookies(k, A) {
    const pq = new MinHeap();

    A.forEach(cookie => pq.push(cookie));

    let operations = 0;
    while (pq.heap.length >= 2 && pq.heap[0] < k) {
        const leastSweet = pq.pop();
        const secondLeastSweet = pq.pop();
        const newSweetness = leastSweet + 2 * secondLeastSweet;
        pq.push(newSweetness);
        operations++;
    }

    return pq.heap[0] >= k ? operations : -1;
}