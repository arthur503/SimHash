SimHash
=======

这是使用Java实现的相似哈希（SimHash）算法。

SimHash是特殊哈希算法的一种。关于相似哈希的原理介绍见我的博客。

此处是相似哈希算法的简单实现，设定如下：

1. 所有权重设定为1；
2. 使用字符串自带的hashCode()计算哈希值；
3. 使用32位二进制作为哈希指纹（即：用int存储）；
4. 使用汉明距离来计算哈希值间距；

如果需要更深入使用，需要修改对应的方法。

By [arthur503](https://github.com/arthur503)

Blog：[龙珠：修炼自己与发现世界](http://arthur503.github.io/blog/)
