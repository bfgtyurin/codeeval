package com.vtyurin.solutions;
import java.io.*;

public class StackImplementation {
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        Stack stack = new Stack();

        while ((line = reader.readLine()) != null) {
            String[] temp = line.split("\\s");

            for (String str : temp) {
                stack.push(Integer.parseInt(str));
            }

            stack.popAndPrintResult();
        }

        reader.close();
    }

    private static class Stack {
        Node head;
        int size = 0;

        void popAndPrintResult() {
            boolean print = true;
            StringBuilder sb = new StringBuilder("");
            while (size != 0) {
                if (print) {
                    sb.append(peek()).append(" ");
                }
                pop();
                print = !print;
            }
            String result = sb.toString().trim();
            System.out.println(result);
        }

        int peek() {
            if (size != 0) {
                return head.data;
            } else {
                throw new IndexOutOfBoundsException();
            }
        }

        void pop() {
            if (size != 0) {
                head = head.next;
                size--;
            }
        }

        private void push(int data) {
            Node item = new Node(data);
            item.next = head;
            head = item;
            size++;
        }

        private class Node {
            int data;
            Node next;

            private Node(int data) {
                this.data = data;
            }
        }
    }
}
