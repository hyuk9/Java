package StudyGroup.chap08.Question1;

import java.util.Comparator;

public class LinkedList<E> {
    //    ✅ 노드
        class Node<E> {
            private E data; // ➡️ 데이터
            private Node<E> next; // ➡️ 뒤쪽 포인터 ( 다음 노드 참조 )

    //    ✅ 생성자
        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node<E> head; // ➡️ 머리 포인터 ( 머리 노드 참조 )
    private Node<E> crnt; // ➡️ 선택 포인터 ( 선택 노드 참조 )

//    ✅ 생성자
    public LinkedList() {
        head = crnt = null;
    }

//    ✅ 노드 검색
    public E search(E obj, Comparator<? super E> c) {
        Node<E> ptr = head; // ➡️ 현재 스캔 중인 노드

        while (ptr != null) {
            if (c.compare(obj, ptr.data) == 0) { // ➡️ 검색 성공
                crnt = ptr;
                return ptr.data;
            }
            ptr = ptr.next; // ➡️ 다음 노드를 선택
        }
        return null; // ➡️ 검색 실패
    }

//    ✅ 머리에 노드 삽입
    public void addFirst(E obj) {
        Node<E> ptr = head; // ➡️ 삽입 전의 머리 노드
        head = crnt = new Node<E>(obj, ptr);
    }
//    ✅ 꼬리에 노드 삽입
    public void addLast(E obj) {
        if (head == null) { // ➡️ 리스트가 비어 있으면
            addFirst(obj); // ➡️ 머리에 삽입
        } else {
            Node<E> ptr = head;
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            ptr.next = crnt = new Node<E>(obj, null);
        }
    }

    public void removeFirst() {
        if (head != null) {
            head = crnt = head.next;
        }
    }

    public void removeLast() {
        if (head != null) {
            if (head.next == null) { // ➡️ 노드가 하나만 있으면
                removeFirst(); // ➡️ 머리 노드를 삭제
            } else {
                Node<E> ptr = head; // ➡️ 스캔 중인 노드
                Node<E> pre = head; // ➡️ 스캔 중인 노드의 앞쪽 노드

                while (ptr.next != null){
                    pre = ptr;
                    ptr = ptr.next;
                }
                pre.next = null; // ➡️ pre는 삭제 후의 꼬리 노드
                crnt = pre;
            }
        }
    }

//    ✅ 노드 p를 삭제
    public void remove(Node p) {
        if (head != null) {
            if (p == head) { // ➡️ p가 머리 노드면
                removeFirst(); // ➡️ 머리 노드를 삭제
            } else {
                Node<E> ptr = head;

                while (ptr.next != p) {
                    ptr = ptr.next;
                    if (ptr == null) return; // ➡️ p가 리스트에 없음
                }
                ptr.next = p.next;
                crnt = ptr;
            }
        }
    }

//    ✅ 선택 노드를 삭제
    public void removeCurrentNode() {
        remove(crnt);
    }

//    ✅ 모든 노드를 삭제
    public void clear() {
        while (head != null) { // ➡️ 노드에 아무것도 없을 때까지
            removeFirst(); // ➡️ 머리 노드를 삭제
        }
        crnt = null;
    }

//    ✅ 선택 노드를 하나 뒤쪽으로 진행
    public boolean next() {
        if (crnt == null || crnt.next == null) {
            return false; // ➡️ 진행할 수 없음
        }
        crnt = crnt.next;
        return true;
    }

//    ✅ 선택 노드를 출력
    public void printCurrentNode() {
        if (crnt == null) {
            System.out.println("선택한 노드를 없습니다");
        } else {
            System.out.println(crnt.data);
        }
    }

//    ✅ 모든 노드를 출력
    public void dump(){
        Node<E> ptr = head;

        while (ptr != null) {
            System.out.println(ptr.data);
            ptr = ptr.next;
        }
    }

    //    ✅ 선택한 노드를 찾아 가장 앞쪽의 노드만 남기고 모두 삭제
    public void purge(Comparator<? super E> c) {
        Node<E> ptr = head; // ➡️ 포인터를 머리 노드로 지정

        while (ptr != null) { // ➡️ 포인터가 null 이 아닐 때까지 반복
            int count = 0; // ➡️ 개수 세기
            Node<E> ptr2 = ptr; // ➡️ 포인터2를 포인터값으로 초기화
            Node<E> pre = ptr; // ➡️ 이전 노드를 포인터값으로 초기화

            while (pre.next != null) { // ➡️ 이전 노드의 다음 노드가 null 이 아닐 때까지 반복
                ptr2 = pre.next; // ➡️ 포인터2에 이전 노드의 다음 노드로 초기화
                if (c.compare(ptr.data, ptr2.data) == 0) { // ➡️ 포인터의 데이터와 포인터2의 데이터를 비교했을 때 같지 않다면
                    pre.next = ptr2.next; // ➡️ 이전 노드의 다음 노드를 포인터2의 다음 노드값으로 초기화
                    count++; // ➡️ 개수 증가
                } else // ➡️ 이전 노드의 다음 노드가 null 이라면
                    pre = ptr2; // ➡️ 이전 노드를 포인터2값으로 초기화
            }
            if (count == 0) // ➡️ 개수가 0이라면
                ptr = ptr.next; // ➡️ 포인터를 포인터의 다음 노드값으로 초기화
            else { // ➡️ 개수가 0이 아니라면
                Node<E> temp = ptr; // ➡️ temp 를 포인터값으로 초기화
                remove(ptr); // ➡️ 포인터값을 제거
                ptr = temp.next; // ➡️ 포인터를 temp 의 다음 노드로 초기화
            }
        }
        crnt = head; // ➡️ 반복문 종료 후 선택 노드를 머리 노드로 초기화
    }

}
