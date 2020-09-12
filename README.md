#论文查重
基于余弦向量法判断文本相似度
#开发环境
IntelliJ IDEA Community Edition 2020.2.1 x64+jdk14.0.1+JProfiler

#运行方法
cmd窗口找到release文件夹，输入指令：
java -jar main.jar [文件名1] [文件名2]
java -jar main.jar orig.txt orig_0.8_add.txt
结果自动写入ans.txt
#使用说明
判断依据是词在文本中的位置。因此仅适用于判断段落、或顺序改变不大的文本。
#基本原理
获取两个文本中的所有词，每个词开两个数组分别存储在两个文本中出现的位置。按字典序计算每个词在两个文本中位置向量的余弦值，累加。把余弦值的总和除以词数就是重复率。