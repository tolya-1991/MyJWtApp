/*
 * Copyright (C) 2009 Emweb bvba, Leuven, Belgium.
 *
 * See the LICENSE file for terms of use.
 */
package tolya.example.myjwt;

import eu.webtoolkit.jwt.*;


public class MainApp extends WApplication {
    public MainApp(WEnvironment env) {
        super(env);

        setTitle("Web aplication");

        getRoot().addWidget(new WText("Please login and password to pass the authentication of the user. "));
        final WLineEdit login = new WLineEdit(getRoot());
        final WLineEdit password = new WLineEdit(getRoot());
        login.setFocus();
        password.setFocus();

        WPushButton btnlogin = new WPushButton("Login", getRoot());
        btnlogin.setMargin(5, Side.Left);

        getRoot().addWidget(new WBreak());

        final WText greeting = new WText(getRoot());

        btnlogin.clicked().addListener(this, new Signal.Listener() {
            public void trigger() {
                try {
                    if ("admin".equals(login.getText()) && password.getText().equals("admin")) {
                        greeting.setText("Congratulations Admin have passed authentication");
                    } else if ("user".equals(login.getText()) && password.getText().equals("user")) {
                        greeting.setText("Congratulations User have passed authentication");
                    } else {
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
