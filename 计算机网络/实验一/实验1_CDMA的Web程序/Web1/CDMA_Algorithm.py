import numpy as np
#判断码片序列是否两两正交
def judge(ls):
    for i in range(len(ls)):
        for j in range(i+1,len(ls)):
            if sum(map(lambda x, y: x * y, ls[i], ls[j]))!=0:
                return
    return ls
#处理含有嵌套列表的字符串数组
def convert_to_num_list(str_list):
    num_list = []
    for item in str_list:
        if type(item) == list:
            num_list.append(convert_to_num_list(item))
        else:
            num_list.append(int(item))
    return num_list
#分析每个站指派的码片代表的数据信息
def Analysis(data1, data5):
    str_num = data1
    str_list = eval(str_num)  # 将字符串转换为Python对象
    ls = convert_to_num_list(str_list)
    str_num = data5
    str_list = eval(str_num)  # 将字符串转换为Python对象
    wanted = convert_to_num_list(str_list)
    while(True):
        if (judge(ls) is not None):
            break
    totalchip = np.zeros((1, 8))
    for i in range(len(ls)):
        if wanted[i]==1:
            wanted2chip = [1, 1, 1, 1, 1, 1, 1, 1]
        elif wanted[i]==0:
            wanted2chip = [-1, -1, -1, -1, -1, -1, -1, -1]
        else:
            wanted2chip = [0, 0, 0, 0, 0, 0, 0, 0]
        schip = np.array(wanted2chip)*np.array(ls[i])
        totalchip = np.sum([totalchip, schip], axis=0).tolist()
    rchip = totalchip
    int_rchip = []
    for num in rchip[0]:
        int_rchip.append(int(num))
    #输入格式：-1,1,-3,1,-1,-3,1,1
    r = []
    for i in range(len(ls)):
        m = sum(map(lambda x, y: x * y, int_rchip, ls[i])) / len(int_rchip)
        if m == 1:
            r.append('第%d站指派的码片:发送的是1' % (i + 1))
        elif m == 0:
            r.append('第%d站指派的码片:没发送数据' % (i + 1))
        elif m == -1:
            r.append('第%d站指派的码片为:发送的是0' % (i + 1))
    return r
