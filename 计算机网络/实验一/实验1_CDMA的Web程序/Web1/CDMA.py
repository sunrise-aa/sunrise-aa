from flask import Flask,request,render_template,redirect,url_for
import CDMA_Algorithm

app = Flask(__name__)

@app.route('/')
def Index():
    return render_template('Chip1.html')

@app.route('/Analysis',methods = ['POST'])
def Output():
    if request.method == 'POST':
        data1 = request.form['data1']
        data5 = request.form['data5']
    r = CDMA_Algorithm.Analysis(data1,data5)
    datar = {"result":r}
    return render_template('Analysis1.html',data = datar)

if __name__=="__main__":
    app.run(host='127.0.0.1',port=5500,debug='True')