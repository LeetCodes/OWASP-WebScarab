/*
 * RevealHiddenPanel.java
 *
 * Created on July 25, 2003, 10:58 PM
 */

package org.owasp.webscarab.ui.swing.proxy;

import org.owasp.webscarab.plugin.proxy.module.*;

import org.owasp.webscarab.ui.swing.SwingPlugin;


/**
 *
 * @author  rdawes
 */
public class MiscPanel extends javax.swing.JPanel implements SwingPlugin {
    
    private RevealHidden _revealHidden;
    private BrowserCache _browsercache;
    private CookieTracker _cookieTracker;
    
    /** Creates new form RevealHiddenPanel */
    public MiscPanel(RevealHidden revealHidden, BrowserCache browserCache, CookieTracker cookieTracker) {
        _revealHidden = revealHidden;
        _browsercache = browserCache;
        _cookieTracker = cookieTracker;
        initComponents();
        configure();
    }

    public javax.swing.JPanel getPanel() {
        return this;
    }    
    
    public String getPluginName() {
        return new String("Miscellaneous");
    }    
    
    private void configure() {
        interceptHiddenFieldCheckBox.setSelected(_revealHidden.getEnabled());
        browserCacheCheckBox.setSelected(_browsercache.getEnabled());
        injectRequestCookiesCheckBox.setSelected(_cookieTracker.getInjectRequests());
        readResponseCookiesCheckBox.setSelected(_cookieTracker.getReadResponses());
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        java.awt.GridBagConstraints gridBagConstraints;

        interceptHiddenFieldCheckBox = new javax.swing.JCheckBox();
        browserCacheCheckBox = new javax.swing.JCheckBox();
        spacerLabel = new javax.swing.JLabel();
        injectRequestCookiesCheckBox = new javax.swing.JCheckBox();
        readResponseCookiesCheckBox = new javax.swing.JCheckBox();

        setLayout(new java.awt.GridBagLayout());

        interceptHiddenFieldCheckBox.setText("Reveal hidden fields in HTML pages : ");
        interceptHiddenFieldCheckBox.setToolTipText("Select this to change all hidden form fields to text fields. Looks at pages of type HTML and javascript.");
        interceptHiddenFieldCheckBox.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        interceptHiddenFieldCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                interceptHiddenFieldCheckBoxActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(interceptHiddenFieldCheckBox, gridBagConstraints);

        browserCacheCheckBox.setText("Prevent browser from caching content : ");
        browserCacheCheckBox.setToolTipText("");
        browserCacheCheckBox.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        browserCacheCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browserCacheCheckBoxActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(browserCacheCheckBox, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(spacerLabel, gridBagConstraints);

        injectRequestCookiesCheckBox.setText("Inject known cookies into requests");
        injectRequestCookiesCheckBox.setToolTipText("");
        injectRequestCookiesCheckBox.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        injectRequestCookiesCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                injectRequestCookiesCheckBoxActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(injectRequestCookiesCheckBox, gridBagConstraints);

        readResponseCookiesCheckBox.setText("Get cookies from responses");
        readResponseCookiesCheckBox.setToolTipText("");
        readResponseCookiesCheckBox.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        readResponseCookiesCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readResponseCookiesCheckBoxActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(readResponseCookiesCheckBox, gridBagConstraints);

    }//GEN-END:initComponents

    private void readResponseCookiesCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readResponseCookiesCheckBoxActionPerformed
        _cookieTracker.setReadResponses(readResponseCookiesCheckBox.isSelected());
    }//GEN-LAST:event_readResponseCookiesCheckBoxActionPerformed

    private void injectRequestCookiesCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_injectRequestCookiesCheckBoxActionPerformed
        _cookieTracker.setInjectRequests(injectRequestCookiesCheckBox.isSelected());
    }//GEN-LAST:event_injectRequestCookiesCheckBoxActionPerformed

    private void browserCacheCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browserCacheCheckBoxActionPerformed
        _browsercache.setEnabled(browserCacheCheckBox.isSelected());
    }//GEN-LAST:event_browserCacheCheckBoxActionPerformed

    private void interceptHiddenFieldCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_interceptHiddenFieldCheckBoxActionPerformed
        _revealHidden.setEnabled(interceptHiddenFieldCheckBox.isSelected());
    }//GEN-LAST:event_interceptHiddenFieldCheckBoxActionPerformed

    public javax.swing.Action[] getConversationActions() {
        return null;
    }    
    
    public javax.swing.Action[] getURLActions() {
        return null;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox browserCacheCheckBox;
    private javax.swing.JCheckBox injectRequestCookiesCheckBox;
    private javax.swing.JCheckBox interceptHiddenFieldCheckBox;
    private javax.swing.JCheckBox readResponseCookiesCheckBox;
    private javax.swing.JLabel spacerLabel;
    // End of variables declaration//GEN-END:variables
    
}
