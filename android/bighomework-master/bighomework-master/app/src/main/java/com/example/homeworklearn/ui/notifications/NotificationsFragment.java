package com.example.homeworklearn.ui.notifications;

import android.app.AlertDialog;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.homeworklearn.R;

public class NotificationsFragment extends Fragment {

    private NotificationsViewModel notificationsViewModel;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {


        final String[] lang = new String[]{"骆发茂1：你好哇", "骆发茂2：辛苦你了", "骆发茂3：加油哦", "骆发茂4：要开心", "骆发茂5：谢谢你", "骆发茂6：我很好"};//显示列表对话框two
        final String[] singlechoose = new String[]{"骆发茂1：这是第一个", "骆发茂2：这是第二个", "骆发茂3：这是第三个", "骆发茂4：这是第四个", "骆发茂5：这是第五个", "骆发茂6：这是第六个", "骆发茂7：这是第七个"};//单选列表对话框three
        final String[] fav = new String[]{"骆发茂喜欢喜剧", "骆发茂喜欢悲剧", "骆发茂喜欢爱情", "骆发茂喜欢动作"};//复选列表对话框four
        super.onActivityCreated(savedInstanceState);


        /*---------------------------动态广播接口-----------------------------------------*/

        dynamic_Myreceiver.setDynamic_interface(new dynamic_Myreceiver.Dynamic_interface() {
            @Override
            public void set_dynamic_message() {
                TextView dynamic_info = requireView().findViewById(R.id.btn_dialog_seven_dynamicbroadcastTO_textview);
                dynamic_info.setText("动态广播初始化完成");
                dynamic_info.setTextColor(Color.parseColor("#00cc00"));
                dynamic_info.setTextSize(25);


            }
        });
        /*---------------------------动态广播接口-----------------------------------------*/

        /*---------------------------动态广播-----------------------------------------*/

        requireView().findViewById(R.id.btn_dialog_seven_dynamic_sendbroadcast).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "这里是动态广播，在发送中！", Toast.LENGTH_SHORT).show();

                System.out.println("======================动态测试开始！！！！！！！！！====================================");

                Intent intent_dynamic_broadcast = new Intent();
                //只要有人隐式调用这个setaciton，addaction就知道要过滤什么了，addaction就可以调用了
                intent_dynamic_broadcast.setAction("dynamic_sendmsg");
                intent_dynamic_broadcast.putExtra("dynamic_msg", "我是动态广播");
                getActivity().sendBroadcast(intent_dynamic_broadcast);
                System.out.println("======================动态测试结束！！！！！！！！！====================================");

            }
        });
        //定义一个广播监听器；

        final dynamic_Myreceiver[] dynamic_myreceivers = {null};

        requireView().findViewById(R.id.btn_dialog_seven_dynamic_register_broadcast).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "这里是动态广播，注册中！", Toast.LENGTH_SHORT).show();

                dynamic_myreceivers[0] = new dynamic_Myreceiver();
                //定义一个过滤器；
                //实例化过滤器；
                IntentFilter dynamic_filter = new IntentFilter();
                //添加过滤的Action值；
                dynamic_filter.addAction("dynamic_sendmsg");
                getActivity().registerReceiver(dynamic_myreceivers[0], dynamic_filter);
            }
        });


        requireView().findViewById(R.id.btn_dialog_seven_dynamic_unregister_broadcast).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "这里是动态广播，取消注册中！", Toast.LENGTH_SHORT).show();

                getActivity().unregisterReceiver(dynamic_myreceivers[0]);


            }
        });

        /*---------------------------动态广播-----------------------------------------*/


        /*---------------------------静态广播接口-----------------------------------------*/
        /*类名.*/
        Static_Myreceiver.setStatic_interface(new Static_Myreceiver.Static_interface() {
            @Override
            public void set_static_message() {
                TextView static_info = requireView().findViewById(R.id.btn_dialog_seven_staticbroadcastTO_textview);
                static_info.setText("静态广播初始化完成");
                static_info.setTextColor(Color.parseColor("#00cc00"));
                static_info.setTextSize(25);
            }
        });
        /*---------------------------静态广播接口-----------------------------------------*/

        /*---------------------------静态广播-----------------------------------------*/

        requireView().findViewById(R.id.btn_dialog_seven_static_broadcast).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "这里是静态广播，在发送中！", Toast.LENGTH_SHORT).show();

                System.out.println("======================静态测试开始！！！！！！！！！====================================");
                Intent intent_broadcast = new Intent("com.example.homeworklearn.ui.notifications.Static_Myreceiver");
                intent_broadcast.setComponent(new ComponentName(getActivity().getPackageName(), String.valueOf(Static_Myreceiver.class)));
                intent_broadcast.setAction("com.example.homeworklearn.ui.notifications.Static_Myreceiver");
                /*通过这个去找到*/
                intent_broadcast.setPackage(getActivity().getPackageName());
                intent_broadcast.addFlags(intent_broadcast.FLAG_INCLUDE_STOPPED_PACKAGES);
                intent_broadcast.setClassName(getActivity().getPackageName(), "com.example.homeworklearn.ui.notifications.Static_Myreceiver");

                intent_broadcast.putExtra("msg", "这是一条静态广播");

                //     getActivity().getApplicationContext().sendBroadcast(intent_broadcast);
                getActivity().sendBroadcast(intent_broadcast);
                System.out.println("======================静态测试结束！！！！！！！！！====================================");


            }
        });

        /*---------------------------静态广播-----------------------------------------*/





        /*---------------------------旧版显示对话框-----------------------------------------*/


        requireView().findViewById(R.id.btn_dialog_one).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                //消息框的标题
                builder.setTitle("旧版显示对话框")
                        .setIcon(R.drawable.ic_dashboard_black_24dp)
                        //消息框内容
                        .setMessage("这是旧版的对话框，使用简单但是没有自动支持屏幕翻转")
                        //点击对话框以外的区域是否让对话框消失
                        .setCancelable(true)
                        //确定按钮，点击确定按钮之后就显示
                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getContext(), "点击了确定~", Toast.LENGTH_SHORT).show();
                                dialog.dismiss();
                            }
                        })
                        //取消按钮，点击取消按钮之后就显示
                        .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getContext(), "点击了取消~", Toast.LENGTH_SHORT).show();
                                dialog.dismiss();
                            }
                        })
                        //忽略按钮，点击忽略按钮之后就显示
                        .setNeutralButton("忽略", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getContext(), "点击了忽略~", Toast.LENGTH_SHORT).show();
                                dialog.dismiss();
                            }
                        });

                AlertDialog alertDialog = builder.create();
                //显示对话框
                alertDialog.show();
            }
        });
        /*---------------------------旧版显示对话框-----------------------------------------*/

        /*---------------------------新版显示对话框-----------------------------------------*/

        requireView().findViewById(R.id.btn_dialog_two).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder_two = new AlertDialog.Builder(getContext());
                //消息框的标题
                builder_two.setTitle("新版显示对话框")
                        .setIcon(R.drawable.ic_dashboard_black_24dp)
                        //消息框的内容
                        .setMessage("这是新版的对话框，推荐使用这种方式支持自动支持屏幕翻转")
                        //点击对话框以外的区域是否让对话框消失
                        .setCancelable(true)
                        //确定按钮，点击确定按钮之后就显示
                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getContext(), "点击了确定~", Toast.LENGTH_SHORT).show();
                                dialog.dismiss();
                            }
                        })
                        //取消按钮，点击取消按钮之后就显示
                        .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getContext(), "点击了取消~", Toast.LENGTH_SHORT).show();
                                dialog.dismiss();
                            }
                        })
                        //忽略按钮，点击忽略按钮之后就显示
                        .setNeutralButton("忽略", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getContext(), "点击了忽略~", Toast.LENGTH_SHORT).show();
                                dialog.dismiss();
                            }
                        });

                AlertDialog alertDialog = builder_two.create();
                //显示对话框
                alertDialog.show();
            }
        });
        /*---------------------------新版显示对话框-----------------------------------------*/


        /*-----------------------------普通选择框---------------------------------------*/
        requireView().findViewById(R.id.btn_dialog_three).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder_btn_dialog_three = new AlertDialog.Builder(getContext());
                //消息框的标题
                builder_btn_dialog_three.setTitle("普通选择对话框");
                //消息框的图标
                builder_btn_dialog_three.setIcon(R.drawable.ic_launcher_foreground);
                //点击对话框以外的区域是否让对话框消失
                builder_btn_dialog_three.setCancelable(true);
                //消息框选了选项后，会提示选择了什么
                builder_btn_dialog_three.setItems(lang, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getContext(), "你选择了" + lang[which], Toast.LENGTH_SHORT).show();
                    }
                });
                AlertDialog alertDialog_btn_dialog_three = builder_btn_dialog_three.create();
                alertDialog_btn_dialog_three.show();
            }
        });

        /*-----------------------------普通选择框---------------------------------------*/

        /*-------------------------------单选列表对话框-------------------------------------*/
        requireView().findViewById(R.id.btn_dialog_four).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder_btn_dialog_four = new AlertDialog.Builder(getContext());
                //消息框的标题
                builder_btn_dialog_four.setTitle("单选列表对话框");
                //消息框的图标
                builder_btn_dialog_four.setIcon(R.drawable.ic_home_black_24dp);
                builder_btn_dialog_four.setCancelable(true);
                //确定按钮，点击确定按钮之后就显示
                builder_btn_dialog_four.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getContext(), "你点击了确定", Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }
                });
                //取消按钮，点击取消按钮之后就显示

                builder_btn_dialog_four.setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getContext(), "你点击了取消", Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }
                });
                //忽略按钮，点击忽略按钮之后就显示

                builder_btn_dialog_four.setNeutralButton("忽略", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getContext(), "你点击了忽略", Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }
                });
                //选择的内容，点击之后就显示选择的内容
                builder_btn_dialog_four.setSingleChoiceItems(singlechoose, 0, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getContext(), singlechoose[which], Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }
                });
                AlertDialog alertDialog_btn_dialog_four = builder_btn_dialog_four.create();
                alertDialog_btn_dialog_four.show();
            }
        });
        /*-------------------------------单选列表对话框-------------------------------------*/

        /*----------------------------多选列表对话框----------------------------------------*/
        requireView().findViewById(R.id.btn_dialog_five).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //选了之后显示flase或者ture
                final boolean[] selectedbtn_five_selected = {false, false, false, false};
                AlertDialog.Builder builder_btn_dialog_five = new AlertDialog.Builder(
                        getContext());
                //点击消息框之后的内容将退出消息框
                builder_btn_dialog_five.setCancelable(true);
                //消息框的标题
                builder_btn_dialog_five.setTitle("多选列表对话框")
                        //多选消息框的选择判断
                        .setMultiChoiceItems(fav, selectedbtn_five_selected,
                                new DialogInterface.OnMultiChoiceClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog,
                                                        int which, boolean isChecked) {
                                        selectedbtn_five_selected[which] = isChecked;
                                    }
                                })
                        //点击确定之后，将判断选择的内容
                        .setPositiveButton("确定",
                                new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog,
                                                        int which) {
                                        StringBuffer buffer = new StringBuffer();
                                        for (int i = 0; i < selectedbtn_five_selected.length; i++) {
                                            if (selectedbtn_five_selected[i] == true) {
                                                buffer.append(selectedbtn_five_selected[i]).append(",");
                                            }
                                        }
                                        if (!buffer.toString().trim().equals("")) {
                                            buffer.deleteCharAt(buffer.length() - 1);
                                            Toast.makeText(getContext(),
                                                    buffer.toString(),
                                                    Toast.LENGTH_LONG).show();
                                        } else {
                                            Toast.makeText(getContext(),
                                                    "你没有选择任何选项！", Toast.LENGTH_LONG)
                                                    .show();
                                        }
                                    }
                                });
                //点击取消，提示取消了
                builder_btn_dialog_five.setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getContext(), "你点击了取消", Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }
                });
                //点击忽略，提示忽略了
                builder_btn_dialog_five.setNeutralButton("忽略", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getContext(), "你点击了忽略", Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }
                });
                AlertDialog alertDialog5 = builder_btn_dialog_five.create();
                alertDialog5.show();
            }
        });
        /*----------------------------多选列表对话框----------------------------------------*/

        /*------------------------------自定义对话框--------------------------------------*/
        /*有时候，只显示简单的标题和信息是满足不了我们的要求，
        比如我们要实现一个登录对话框的话，那就需要在对话框上放置EditText输入框了。
        AlertDialog早就为我们准备好了setView方法，
        只要往里面放进我们需要的对话框的View对象就可以了。*/
        requireView().findViewById(R.id.btn_dialog_six).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*setView方法是通过AlertDialog的对象调用的，所以这里的代码顺序会稍有不同：
                我们要先创建AlertDialog对象和View对象，然后再去初始化对话框中的控件。*/
                AlertDialog.Builder builder_six = new AlertDialog.Builder(getContext());/*builder*/
                final AlertDialog alertDialog_six = builder_six.create();/*create*/
                //新建了布局文件，在layout中的fragment_diy.xml中
                View dialogView_six = View.inflate(getContext(), R.layout.fragment_diy, null);
                alertDialog_six.setView(dialogView_six);
                alertDialog_six.show();

                //---------------新建了布局文件，在layout中的fragment_diy.xml中,这是对里面的布局做修饰---------------
                EditText etName = (EditText) dialogView_six.findViewById(R.id.et_name);
                EditText etPwd = (EditText) dialogView_six.findViewById(R.id.et_pwd);
                Button btnLogin = (Button) dialogView_six.findViewById(R.id.btn_login);
                Button btnCancel = (Button) dialogView_six.findViewById(R.id.btn_cancel);

                //将text内容tostring化然后判断
                final String name = etName.getText().toString();
                final String pwd = etPwd.getText().toString();

                //登录按钮，将判断输入的内容做出提出
                btnLogin.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (TextUtils.isEmpty(name) && TextUtils.isEmpty(pwd)) {
                            Toast.makeText(getContext(), "用户名和密码不能为空，请输入！", Toast.LENGTH_SHORT).show();
                            return;
                        }

                        Toast.makeText(getContext(), "你点击了登录", Toast.LENGTH_SHORT).show();
                        alertDialog_six.show();
                        alertDialog_six.dismiss();
                    }
                });
                //取消按钮，提示取消了
                btnCancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getContext(), "你点击了取消", Toast.LENGTH_SHORT).show();
                        alertDialog_six.show();
                        alertDialog_six.dismiss();
                    }
                });
                //---------------新建了布局文件，在layout中的fragment_diy.xml中,这是对里面的布局做修饰---------------



/*                builder_six.setTitle("这是自定义dialog");
                builder_six.setCancelable(true);
                builder_six.setIcon(R.drawable.ic_dashboard_black_24dp);
                builder_six.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getContext(),"点击了确定",Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }
                });
                builder_six.setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getContext(),"点击了取消",Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }
                });*/

            }
        });
    }
    /*------------------------------自定义对话框--------------------------------------*/

    /*------------------------------跳转fragment--------------------------------------*/
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        notificationsViewModel =
                new ViewModelProvider(this).get(NotificationsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_notifications, container, false);
        return root;
    }

}