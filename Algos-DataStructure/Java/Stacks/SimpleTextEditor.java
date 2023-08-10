public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<StringBuilder> stack = new Stack<>();
        int q = scanner.nextInt();
        scanner.nextLine();
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < q; i++) {
            String[] query = scanner.nextLine().split(" ");
            int type = Integer.parseInt(query[0]);
            switch (type) {
                case 1:
                    stack.push(new StringBuilder(s));
                    s.append(query[1]);
                    break;
                case 2:
                    stack.push(new StringBuilder(s));
                    int k = Integer.parseInt(query[1]);
                    s.delete(s.length() - k, s.length());
                    break;
                case 3:
                    int index = Integer.parseInt(query[1]) - 1;
                    System.out.println(s.charAt(index));
                    break;
                case 4:
                    if (!stack.empty()) {
                        s = stack.pop();
                    }
                    break;
                default:
                    break;
            }
        }
        scanner.close();

}
