package com.aiidc.sps.ep.utility;
import java.security.GeneralSecurityException;
import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.sun.mail.util.MailSSLSocketFactory;


public class SendEmailUtil {
	
	/**
	 *  发送普通邮件
	 *  特别注意：使用javaEmail发送邮件时，邮件的发送方需要开启POP3 和SMTP服务。
	 * @param host  host 邮件服务器（不同的邮箱，其服务地址不一样：QQ-smtp.qq.com）
	 * @param from 发送者邮箱
	 * @param password 发送者邮箱的授权码
	 * @param to 收件人
	 * @param subject 主题
	 * @param content 正文
	 * @return
	 */
	public static boolean sendTextEmail(String host,String from,String password,String[] to,String subject,String content)
	{
		boolean flag =false;
		Properties props = new Properties();
		props.setProperty("mail.debug", "true");
		props.setProperty("mail.smtp.auth","true");
		props.setProperty("mail.smtp.host", host);
		props.setProperty("mail.transport.protocol", "smtp");
		props.setProperty("mail.smtp.port","465");
		props.put("mail.smtp.ssl.enable", "true");
		try {
			MailSSLSocketFactory sf = new MailSSLSocketFactory();
			sf.setTrustAllHosts(true);
			props.put("mail.smtp.ssl.socketFactory", sf);
			MyAuthenticator myauth = new MyAuthenticator(from, password);
			Session session =Session.getInstance(props,myauth);
			
			MimeMessage message = new MimeMessage(session);
			message.setSubject(subject);
			message.setText(content);
			message.setSentDate(new Date());
			message.setFrom(new InternetAddress(from));
			
			InternetAddress[] tos = new InternetAddress[to.length];
			for(int i=0;i<to.length;i++){
				tos[i] = new InternetAddress(to[i]);
			}
			message.setRecipients(Message.RecipientType.TO, tos);
			message.saveChanges();
			Transport.send(message);
			flag=true;
		} catch (GeneralSecurityException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		return flag;
	}
}

























