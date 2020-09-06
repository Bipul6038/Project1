/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * UserAccountDetail.java
 *
 * 
 */
package jcodeguard;

import jcodeguard.alpha.DBOperations;
import jcodeguard.alpha.UsermasterBean;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 *  
 */
public class UserAccountDetail extends javax.swing.JPanel {

    int count = 0;
    ArrayList alstUser;
    DBOperations objDB = new DBOperations();
    String AddUpdateFlag;

    /** Creates new form UserAccountDetail */
    public UserAccountDetail() {
        initComponents();
        btnSave.setEnabled(false);
        disable(false);
        alstUser = objDB.getAllUserDetailList();
        if (alstUser.size() > 0) {
            UsermasterBean objBean = (UsermasterBean) alstUser.get(count);
            showUserRecord(objBean);
        }
        setVisible(true);
    }

    public UserAccountDetail(int count) {
        initComponents();
        btnSave.setEnabled(false);
        disable(false);
        alstUser = objDB.getAllUserDetailList();
        this.count = count;
        if (alstUser.size() > 0) {
            UsermasterBean objBean = (UsermasterBean) alstUser.get(count);
            showUserRecord(objBean);
        }
        setVisible(true);
    }

    public UserAccountDetail(String operationType) {
        initComponents();
        alstUser = objDB.getAllUserDetailList();
        if (operationType.equals("add")) {
            AddUpdateFlag = "add";
            disable(true);
            clear();
            btnSave.setEnabled(true);
            btnAdd.setEnabled(false);

            btnUpdate.setEnabled(false);

            btnFirst.setEnabled(false);
            btnPrevious.setEnabled(false);
            btnNext.setEnabled(false);
            btnLast.setEnabled(false);
            btnUserPersonalDetail.setEnabled(false);
            int maxUserID = objDB.getMaxUserId();
            txtUserID.setText(String.valueOf(maxUserID + 1));
        }

        setVisible(true);
    }

    public void disable(boolean val) {
        txtUsername.setEditable(val);
        txtPassword.setEditable(val);
        ddlUserType.setEnabled(val);
        ddlUserStatus.setEnabled(val);
        ddlSecurityQuestion.setEnabled(val);
        txtSecurityAnswer.setEditable(val);
    }

    public void clear() {
        txtUsername.setText("");
        txtPassword.setText("");
        txtSecurityAnswer.setText("");
        

    }

    public void showUserRecord(UsermasterBean objBean) {

        txtUserID.setText(String.valueOf(objBean.getUserId()));
        txtUsername.setText(objBean.getUsername());
        txtPassword.setText(objBean.getPassword());
        ddlUserType.setSelectedItem(objBean.getUserType());
        ddlUserStatus.setSelectedItem(objBean.getUserStatus());
        ddlSecurityQuestion.setSelectedItem(objBean.getSecurityQuestion());
        txtSecurityAnswer.setText(objBean.getSecurityAnswer());

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtSecurityAnswer = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        txtUserID = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        ddlUserType = new javax.swing.JComboBox();
        ddlUserStatus = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnUserPersonalDetail = new javax.swing.JButton();
        ddlSecurityQuestion = new javax.swing.JComboBox();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setText("Security Answer");

        jLabel4.setText("User Type");

        jLabel6.setText("Security Question");

        jLabel5.setText("User Status");

        jLabel3.setText("Password");

        jLabel2.setText("Username");

        jLabel1.setText("User ID");

        txtUserID.setEditable(false);

        ddlUserType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrator", "Employee" }));
        ddlUserType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddlUserTypeActionPerformed(evt);
            }
        });

        ddlUserStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Active", "InActive" }));

        jLabel8.setFont(new java.awt.Font("Courier New", 1, 18));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("User Account Detail");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnFirst.setText("First");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnPrevious.setText("Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnLast.setText("Last");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        btnUserPersonalDetail.setText("Personal Detail");
        btnUserPersonalDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserPersonalDetailActionPerformed(evt);
            }
        });

        ddlSecurityQuestion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "What is your first mobile number? ", "What is your first school name?", "What is your hobby?", "Which is your favourite color?", "Which is your favourite sport?" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ddlSecurityQuestion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPassword)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnUserPersonalDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(ddlUserType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSecurityAnswer, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                            .addComponent(ddlUserStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPrevious, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNext, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel8)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUserPersonalDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ddlUserType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ddlUserStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ddlSecurityQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtSecurityAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ddlUserTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddlUserTypeActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_ddlUserTypeActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        AddUpdateFlag = "add";
        disable(true);
        clear();
        btnSave.setEnabled(true);
        btnAdd.setEnabled(false);

        btnUpdate.setEnabled(false);

        btnFirst.setEnabled(false);
        btnPrevious.setEnabled(false);
        btnNext.setEnabled(false);
        btnLast.setEnabled(false);
        btnUserPersonalDetail.setEnabled(false);
        int maxUserID = objDB.getMaxUserId();
        txtUserID.setText(String.valueOf(maxUserID + 1));
}//GEN-LAST:event_btnAddActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        if (alstUser.size() > 0) {
            count = 0;
            UsermasterBean objBean = (UsermasterBean) alstUser.get(count);
            showUserRecord(objBean);
        }
}//GEN-LAST:event_btnFirstActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        AddUpdateFlag = "update";
        disable(true);
        btnSave.setEnabled(true);
        btnAdd.setEnabled(false);
        btnUpdate.setEnabled(false);

        btnFirst.setEnabled(false);
        btnPrevious.setEnabled(false);
        btnNext.setEnabled(false);
        btnLast.setEnabled(false);
        btnUserPersonalDetail.setEnabled(false);

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        // TODO add your handling code here:
        if (count > 0) {
            count--;
            UsermasterBean objBean = (UsermasterBean) alstUser.get(count);
            showUserRecord(objBean);
        }
}//GEN-LAST:event_btnPreviousActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        if (count < alstUser.size() - 1) {
            count++;
            UsermasterBean objBean = (UsermasterBean) alstUser.get(count);
            showUserRecord(objBean);

        }
}//GEN-LAST:event_btnNextActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        String result = "";
        int flag = 0;
        UsermasterBean objBean = new UsermasterBean();
        objBean.setUserId(Integer.parseInt(txtUserID.getText()));
        objBean.setPassword(new String(txtPassword.getPassword()));
        objBean.setUserType(ddlUserType.getSelectedItem().toString());
        objBean.setUserStatus(ddlUserStatus.getSelectedItem().toString());
        objBean.setUsername(txtUsername.getText());
        objBean.setSecurityQuestion(ddlSecurityQuestion.getSelectedItem().toString());
        objBean.setSecurityAnswer(txtSecurityAnswer.getText());

        if (AddUpdateFlag.equals("add")) {

            if (txtUserID.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "User ID is missing", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else if (txtUsername.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Username is missing", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else if (new String(txtPassword.getPassword()).equals("")) {
                JOptionPane.showMessageDialog(this, "Password is missing", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else if (txtSecurityAnswer.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Security Answer is missing", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                try {
                    result = objDB.addUserAccountDetail(objBean);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Record Cannot be Added", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }

            if (result.equals("added")) {
                flag = 1;
                alstUser = objDB.getAllUserDetailList();
                count = alstUser.size() - 1;
                UsermasterBean objBean1 = (UsermasterBean) alstUser.get(count);
                showUserRecord(objBean1);
                JOptionPane.showMessageDialog(null, "Record has been successfully added", "Record Added", 1);
            } else if (result.equals("failed")) {
                JOptionPane.showMessageDialog(null, "Record not Added", "ERROR", 2);
            } else if (result.equals("exists")) {
                JOptionPane.showMessageDialog(null, "User already exist", "ERROR", 2);

            }
        } else if (AddUpdateFlag.equals("update")) {

            if (txtUserID.getText().equals("")) {

                JOptionPane.showMessageDialog(this, "User ID is missing", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else if (txtUsername.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Username is missing", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else if (new String(txtPassword.getPassword()).equals("")) {
                JOptionPane.showMessageDialog(this, "Password is missing", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                result = objDB.updateUserAccountDetail(objBean);
            }

            if (result.equals("updated")) {
                flag = 1;
                alstUser = objDB.getAllUserDetailList();
                UsermasterBean objBean1 = (UsermasterBean) alstUser.get(count);
                showUserRecord(objBean1);
                JOptionPane.showMessageDialog(null, "Record has been successfully updated", "Record Updated", 1);
            } else if (result.equals("failed")) {
                JOptionPane.showMessageDialog(null, "Record not Added", "ERROR", 2);
            } else if (result.equals("exists")) {
                JOptionPane.showMessageDialog(null, "User already exists", "ERROR", 2);
            }

        }

        if (flag == 1) {
            disable(false);
            btnSave.setEnabled(false);
            btnAdd.setEnabled(true);
            btnUpdate.setEnabled(true);

            btnFirst.setEnabled(true);
            btnPrevious.setEnabled(true);
            btnNext.setEnabled(true);
            btnLast.setEnabled(true);
            btnUserPersonalDetail.setEnabled(true);

        }

}//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        MainFrame.container.removeAll();
        MainFrame.container.setVisible(false);
}//GEN-LAST:event_btnCancelActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        // TODO add your handling code here:
        if (alstUser.size() > 0) {
            count = alstUser.size() - 1;
            UsermasterBean objBean = (UsermasterBean) alstUser.get(count);
            showUserRecord(objBean);
        }
}//GEN-LAST:event_btnLastActionPerformed

    private void btnUserPersonalDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserPersonalDetailActionPerformed
        // TODO add your handling code here:
        MainFrame.container.removeAll();
        UserPersonalDetail objUserPersonalDetail = new UserPersonalDetail(count);
        objUserPersonalDetail.setBounds(250, 100, 460, 450);
        MainFrame.container.setVisible(false);
        MainFrame.container.add(objUserPersonalDetail);
        MainFrame.container.setVisible(true);

}//GEN-LAST:event_btnUserPersonalDetailActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUserPersonalDetail;
    private javax.swing.JComboBox ddlSecurityQuestion;
    private javax.swing.JComboBox ddlUserStatus;
    private javax.swing.JComboBox ddlUserType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtSecurityAnswer;
    private javax.swing.JTextField txtUserID;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}