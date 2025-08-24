package Queues;

public class ArrayImplementationOfCircularQueue {
    public static class CirQue {
        int f = -1;
        int r = -1;
        int size = 0;
        int[] arr = new int[8];
        public void add(int val) throws Exception {
            if (size == arr.length) {
                throw new Exception("Queue is full");
            }
            if (size == 0) {
                f = r = 0;
                arr[r] = val;
            } else if (r < arr.length - 1) {
                r++;
                arr[r] = val;
            } else {
                r = 0;
                arr[r] = val;
            }
            size++;
        }

        public int remove() throws Exception {
            if (size == 0) {
                throw new Exception("Queue is empty");
            }
            int val = arr[f];
            if (f == arr.length - 1) {
                f = 0;
            } else {
                f++;
            }
            size--;
            return val;
        }

        public int peek() throws Exception {
            if (size == 0) {
                throw new Exception("Queue is empty");
            }
            return arr[f];
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public void display(String message) {
            System.out.print(message + ": ");
            if (size == 0) {
                System.out.println("Queue is empty");
                return;
            }

            if (f <= r) {
                for (int i = f; i <= r; i++) {
                    System.out.print(arr[i] + " ");
                }
            } else {
                for (int i = f; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
                for (int i = 0; i <= r; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }

        public int getSize() {
            return size;
        }
    }

    public static void main(String[] args) throws Exception {
        CirQue q = new CirQue();
        q.display("Queue");
         q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display("Queue is ");
        q.remove();
        q.display("Queue after 1 removal");
        q.add(8);
        q.display("Queue after adding 8");
        q.add(7);
        q.display("Queue after adding 7");
        System.out.println("Queue size: " + q.getSize());
    }
}
