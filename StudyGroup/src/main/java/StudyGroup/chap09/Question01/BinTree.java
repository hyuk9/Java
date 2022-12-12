package StudyGroup.chap09.Question01;

import java.util.Comparator;

/**
 * packageName : StudyGroup.chap09.Question01
 * fileName : BinTree
 * author : hyuk
 * date : 2022/12/05
 * description : 실습 9-1 p.368 ~
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/12/05         hyuk          최초 생성
 */
public class BinTree<K, V> {
//    ✅ 노드
    static class Node<K, V> {
        private K key; // 키값
        private V data; // 데이터
        private Node<K, V> left; // 왼쪽 포인터 (왼쪽 자식 노드에 대한 참조)
        private Node<K, V> right; // 오른쪽 포인터 (오른쪽 자식 노드에 대한 참조)

//    ✅ 생성자
    public Node(K key, V data, Node<K, V> left, Node<K, V> right) {
        this.key = key;
        this.data = data;
        this.left = left;
        this.right = right;
    }

//    ✅ 키값을 반환
    K getKey() {
        return key;
    }

//    ✅ 데이터를 반환
    public V getData() {
        return data;
    }

//    ✅ 데이터를 출력
    void print() {
        System.out.println(data);
    }
}

private Node<K, V> root; // ➡️ 루트
    private Comparator<? super K> comparator = null; // ➡️ 비교자

//    ✅ 생성자
    public BinTree() {
        root = null;
    }

//    ✅ 생성자
    public BinTree(Comparator<? super K> c) {
//        this();
//        comparator = c;
        this.comparator = c;
    }

//    ✅ 두 키값을 비교
    private int comp(K key1, K key2) {
        return (comparator == null) ? ((Comparable<K>)key1).compareTo(key2) : comparator.compare(key1, key2);
    }

//    ✅ 키로 검색
    public V search(K key) {
        Node<K, V> p = root; // ➡️ 루트에 주목

        while (true) {
            if (p == null) { // ➡️ 더 이상 진행할 수 없으면 검색 실패
                return null;
            }

            int cond = comp(key, p.getKey());

            if (cond == 0) {
                return p.getData(); // ➡️ key 와 노드 p의 값을 비교해서 같으면 검색 성공
            } else if (cond < 0) {
                p = p.left; // ➡️ key 쪽이 작으면 왼쪽 서브트리에서 검색
            } else {
                p = p.right; // ➡️ key 쪽이 크면 오른쪽 서브트리에서 검색
            }
        }
    }

//    ✅ node를 루트로 하는 서브트리에 노드 <K, V>를 삽입
    private void addNode(Node<K, V> node, K key, V data) {
        int cond = comp(key, node.getKey());
        if (cond == 0) { // ➡️ key가 이미 이진검색트리에 있음
            return;
        } else if (cond < 0) {
            if (node.left == null) {
                node.left = new Node<K, V>(key, data, null, null);
            } else {
                addNode(node.left, key, data); // ➡️ 왼쪽 서브트리에 주목
            }
        } else {
            if (node.right == null) {
                node.right = new Node<K, V>(key, data, null, null);
            } else {
                addNode(node.right, key, data); // ➡️ 오른쪽 서브트리에 주목
            }
        }
    }

//    ✅ 노드를 삽입
    public void add(K key, V data) {
        if (root == null) {
            root = new Node<K, V>(key, data, null, null);
        } else {
            addNode(root, key, data);
        }
    }

//    ✅ 키값이 key인 노드를 삭제
    public boolean remove(K key) {
        Node<K, V> p = root;        // ➡️ 스캔 중인 노드
        Node<K, V> parent = null;   // ➡️ 스캔 중인 노드의 부모 노드
        boolean isLeftChild = true; // ➡️ p가 부모의 왼쪽 자식 노드

        while (true) {
            if (p == null) {
                return false; // ➡️ 더 이상 나아갈 수 없으면 그 키값은 없음
            }

            int cond = comp(key, p.getKey());

            if (cond == 0) {
                break;
            } else {
                parent = p; // ➡️ 가지로 내려가기 전 부모 설정
                if (cond < 0) { //  ➡️ key 값이 작으면 왼쪽 자식 노드로 내려감
                    isLeftChild = true;
                    p = p.left; //  ➡️ 왼쪽 서브트리에서 검색
                } else { // ➡️ key 값이 크면 오른쪽 자식 노드로 내려감
                    isLeftChild = false;
                    p = p.right; // ➡️ 오른쪽 서브트리에서 검색
                }
            }
        }

        if (p.left == null) { // ➡️ p에 왼쪽 자식이 없음
            if (p == root) {
                root = p.right;
            } else if (isLeftChild) {
                parent.left = p.right; //  ➡️ 부모의 왼쪽 포인터가 오른쪽 자식을 가리킴
            } else {
                parent.right = p.right; // ➡️ 부모의 오른쪽 포인터가 오른쪽 자식을 가리킴
            }
        } else if (p.right == null) { //   ➡️ p에 오른쪽 자신이 없음
            if (p == root) {
                root = p.left;
            } else if (isLeftChild) {
                parent.left = p.left; //  ➡️ 부모의 왼쪽 포인터가 왼쪽 자식을 가리킴
            } else {
                parent.right = p.left; // ➡️ 부모의 오른쪽 포인터가 왼쪽 자식을 가리킴
            }
        } else {
            parent = p;
            Node<K, V> left = p.left; //    ➡️ 서브트리 가운데 가장 큰 노드
            isLeftChild = true;
            while (left.right != null) { // ➡️ 가장 큰 노드 left 를 검색
                parent = left;
                left = left.right;
                isLeftChild = false;
            }
            p.key = left.key; //   ➡️ left 의 키값을 p로 옮김
            p.data = left.data; // ➡️ left 의 데이터를 p로 옮김

            if (isLeftChild) {
                parent.left = left.left; //  ➡️ left 삭제
            } else {
                parent.right = left.left; // ➡️ left 삭제
            }
        }
        return true;
    }

//    ✅ node 를 루트로 하는 서브트리의 노드를 키값의 오름차순으로 출력
    private void printSubTree(Node node) {
        if (node != null) {
            printSubTree(node.left); //                        ➡️ 왼쪽 서브트리를 키값의 오름차순으로 출력
            System.out.println(node.key + " " + node.data); // ➡️ node 를 출력
            printSubTree(node.right); //                       ➡️ 오른쪽 서브트리를 키값의 오름차순으로 출력
        }
    }

//    ✅ 모든 노드를 키값의 오름차순으로 출력
    public void print() {
        printSubTree(root);
    }


//    ⭐️ 연습문제 1 ⭐️

//    ✅ node 를 루트로 하는 서브트리의 노드를 키값의 내림차순으로 출력
    private void printSubTreeDesc(Node node) {
        if (node != null) {
            printSubTreeDesc(node.right);                   // ➡️ 오른쪽 서브트리를 키값의 오름차순으로 출력
            System.out.println(node.key + " " + node.data); // ➡️ node 를 출력
            printSubTreeDesc(node.left);                    // ➡️ 왼쪽 서브트리를 키값의 오름차순으로 출력
        }
    }

//    ✅ 모든 노드를 키값의 내림차순으로 출력
    public void printReverse() {
        printSubTreeDesc(root);
    }
}
