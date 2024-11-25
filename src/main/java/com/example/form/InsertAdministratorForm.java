package com.example.form;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.AssertTrue;

/**
 * 管理者情報登録時に使用するフォーム.
 * 
 * @author igamasayuki
 * 
 */
public class InsertAdministratorForm {
	/** 名前 */
	@NotBlank(message = "名前を入力してください。")
	private String name;
	/** メールアドレス */
	@NotBlank(message = "メールアドレスを入力してください。")
	@Email(message = "メールの形式で入力してください。")
	private String mailAddress;
	/** パスワード */
	@NotBlank(message = "パスワードを入力してください。")
	@Size(min = 0, max = 8, message = "8文字以内で入力してください。")
	private String password;
	/** 確認用パスワード */
	private String passwordConfirm;

	@AssertTrue(message = "PasswordとPassword confirmationは同一にしてください。")
	public boolean isPasswordValid() {
		if (password == null || password.isEmpty()) {
			return true;
		}
		return password.equals(passwordConfirm);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMailAddress() {
		return mailAddress;
	}
	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPasswordConfirm() {
		return passwordConfirm;
	}
	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
	}
	@Override
	public String toString() {
		return "InsertAdministratorForm [name=" + name + ", mailAddress=" + mailAddress + ", password=" + password
				+ ", passwordConfirm=" + passwordConfirm + "]";
	}

}
