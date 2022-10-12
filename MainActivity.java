package mydomain.HelloWorld;

import android.app.Activity;
import android.os.Bundle;

import android.app.*;
import android.os.*;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.view.KeyEvent.Callback;
import	android.view.KeyEvent;
import android.view.MenuInflater;
import 	android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.ViewConfiguration;

import android.content.ContextWrapper;
import android.view.ContextThemeWrapper;

import android.content.Context;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;


public class MainActivity extends Activity
{
	boolean a;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        WebView browser = (WebView) findViewById(R.id.webview);
browser.getSettings().setJavaScriptEnabled(true);

String pages="<html><head></head><script>\nfunction myfunction(){\nvar e = document.getElementById(\"listss\");\nvar s= e.options[e.selectedIndex].value;\nvar first = document.getElementById(\"textbox1\").value;\nvar second = document.getElementById(\"textbox2\").value;\nswitch(s)\n {case \"1\":\n var answer =parseFloat(first)-parseFloat(second);\n break;\ncase \"2\":\nvar answer =parseFloat(first)*parseFloat(second);\nbreak\n;case \"3\":\nvar answer =parseFloat(first)/parseFloat(second);\n break;\ndefault:\nvar answer =parseFloat(first)+parseFloat(second);\n}\nvar textbox3 =document.getElementById('textbox3');\n textbox3.value=answer;\n}\n</script> <body     bgcolor=\"#00ff00\" > <input type=\"text\" name=\"textbox1\" id=\"textbox1\"  value=\"0\" style=\"height:50px; width:150px\"  /> <select    id=\"listss\" style=\"height:50px; width:50px\" > <option value=\"0\" selected=\"selected\" >+</option><option value=\"1\">-</option> <option value=\"2\">X</option><option value=\"3\">/</option></select><input type=\"text\" name=\"textbox2\" id=\"textbox2\"  value=\"0\"  style=\"height:50px; width:150px\"  /><input type=\"submit\" name=\"button\" id=\"button1\" onclick=\"myfunction()\" value=\"=\"   style=\"height:50px; width:50px\"  /><br/><input type=\"text\" name=\"textbox3\" id=\"textbox3\"  value=\"0\"  readonly=\"true\" style=\"height:50px; width:150px\"  /></body></html>";
browser.loadData(pages, "text/html", "UTF-8");


    }

	
}
