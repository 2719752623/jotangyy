#!/bin/bash
set -x  # 启用调试模式

/usr/bin/sendEmail \
          -xu 2719752623@qq.com \
          -xp fnzqgvrzkbfaddgc \
          -t 2719752623@qq.com \
          -u "魏钰彤专属青年大学习提醒" \
          -m "SB, don't forget to do this!" \
          -s smtp.qq.com:465 \
          -f 2719752623@qq.com \
          -o tls=yes

if [ $? -eq 0 ]; then
    echo "邮件发送成功。"
else
    echo "发送邮件时出错，请稍后再试。"
fi

set +x  # 关闭调试模式
