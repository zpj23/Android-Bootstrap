package com.example.sample;

import com.beardedhen.androidbootstrap.BootstrapEditText;
import com.beardedhen.androidbootstrap.api.defaults.DefaultBootstrapBrand;

import butterknife.Bind;
import butterknife.OnClick;

import static com.beardedhen.androidbootstrap.api.defaults.DefaultBootstrapBrand.DANGER;
import static com.beardedhen.androidbootstrap.api.defaults.DefaultBootstrapBrand.INFO;
import static com.beardedhen.androidbootstrap.api.defaults.DefaultBootstrapBrand.PRIMARY;
import static com.beardedhen.androidbootstrap.api.defaults.DefaultBootstrapBrand.REGULAR;
import static com.beardedhen.androidbootstrap.api.defaults.DefaultBootstrapBrand.SECONDARY;
import static com.beardedhen.androidbootstrap.api.defaults.DefaultBootstrapBrand.SUCCESS;
import static com.beardedhen.androidbootstrap.api.defaults.DefaultBootstrapBrand.WARNING;

public class BootstrapEditTextExample extends BaseActivity {

    @Override protected int getContentLayoutId() {
        return R.layout.example_bootstrap_edit_text_view;
    }

    @Bind(R.id.bedit_text_change_enabled) BootstrapEditText changeEnabled;
    @Bind(R.id.bedit_text_change_round) BootstrapEditText changeRound;
    @Bind(R.id.bedit_text_change_theme) BootstrapEditText changeTheme;

    @OnClick(R.id.bedit_text_change_enabled_btn) void onChangeEnabledExampleClicked() {
        changeEnabled.setEnabled(!changeEnabled.isEnabled());
    }

    @OnClick(R.id.bedit_text_change_round_btn) void onChangeRoundExampleClicked() {
        changeRound.setRounded(!changeRound.isRounded());
    }

    @OnClick(R.id.bedit_text_change_theme_btn) void onChangeThemeExampleClicked() {
        switch((DefaultBootstrapBrand) changeTheme.getBootstrapBrand()) {
            case PRIMARY:
                changeTheme.setBootstrapBrand(SUCCESS);
                break;
            case SUCCESS:
                changeTheme.setBootstrapBrand(INFO);
                break;
            case INFO:
                changeTheme.setBootstrapBrand(WARNING);
                break;
            case WARNING:
                changeTheme.setBootstrapBrand(DANGER);
                break;
            case DANGER:
                changeTheme.setBootstrapBrand(SECONDARY);
                break;
            case SECONDARY:
                changeTheme.setBootstrapBrand(REGULAR);
                break;
            case REGULAR:
                changeTheme.setBootstrapBrand(PRIMARY);
                break;
        }
    }

}
