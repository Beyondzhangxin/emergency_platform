package com.aiidc.sps.ep.entity;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class EmailServer implements Serializable{
  
	private static final long serialVersionUID = -1364239290020531076L;

	private Long id;

    @NotEmpty(message="邮件服务器不能为空")
    @NotNull(message="邮件服务器不能为空")
    private String emailServer;

    @NotEmpty(message="邮箱地址不能为空")
    @Email(message="邮箱格式不正确")
    private String email;

    @NotEmpty(message="邮箱密码不能为空")
    @Length(min=6,max=16,message="密码长度不正确，在6-20之间")
    private String emailPassword;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmailServer() {
        return emailServer;
    }

    public void setEmailServer(String emailServer) {
        this.emailServer = emailServer;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmailPassword() {
        return emailPassword;
    }

    public void setEmailPassword(String emailPassword) {
        this.emailPassword = emailPassword;
    }

	@Override
	public String toString() {
		return "EmailServer [id=" + id + ", emailServer=" + emailServer + ", email=" + email + ", emailPassword="
				+ emailPassword + "]";
	}
   
}