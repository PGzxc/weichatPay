package net.sourceforge.simcpux.uikit;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import net.sourceforge.simcpux.R;

/**
 * 加载对话框
 */
public class LoadingDialog extends Dialog {

	public LoadingDialog(Context context) {
		super(context);
		init();//初始化
	}

	@SuppressLint("InflateParams")
	private void init() {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		View view = LayoutInflater.from(getContext()).inflate(R.layout.dialog_loading, null);
		setContentView(view);
		WindowManager.LayoutParams lp = getWindow().getAttributes();
		lp.width = WindowManager.LayoutParams.WRAP_CONTENT;
		lp.height = WindowManager.LayoutParams.WRAP_CONTENT;
		setCancelable(false);
		getWindow().setAttributes(lp);
		getWindow().setBackgroundDrawable(new ColorDrawable(Color.argb(0, 0, 0, 0)));
	}
	
	

}
