class TreeNode(var`val`: Int){
    var left: TreeNode? = null
    var right: TreeNode? = null


}

fun main() {
    val root1 = TreeNode(1)
    root1.left = TreeNode(2)
    root1.right = TreeNode(3)

    val root2 = TreeNode(1)
    root2.left = TreeNode(2)
    root2.right = TreeNode(7)

    val result = isSametree(root1, root2)
    println(result)

}
fun isSametree(p: TreeNode?, q: TreeNode?): Boolean {
    if (q == null && p == null) {
        return true
    }
    if (q== null && p!= null){
        return false
    }
    if (q!=null && p == null){
        return false
    }
    return (p?.`val` ==q?.`val`) &&
            isSametree(p?.left, q?.left) &&
            isSametree(p?.right, q?.right)
}
