/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MaterialPreviewWidget.java
 *
 * Created on 1 août 2011, 10:27:05
 */
package com.jme3.gde.materials.multiview.widgets;

import com.jme3.asset.DesktopAssetManager;
import com.jme3.asset.MaterialKey;
import com.jme3.gde.core.assets.ProjectAssetManager;
import com.jme3.gde.core.scene.PreviewRequest;
import com.jme3.gde.core.scene.SceneApplication;
import com.jme3.gde.core.scene.SceneListener;
import com.jme3.gde.core.scene.SceneRequest;
import com.jme3.gde.materials.MaterialPreviewRenderer;
import com.jme3.material.MatParam;
import com.jme3.material.Material;
import com.jme3.math.FastMath;
import com.jme3.math.Quaternion;
import com.jme3.math.Vector3f;
import com.jme3.renderer.RendererException;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;
import com.jme3.scene.shape.Quad;
import com.jme3.scene.shape.Sphere;
import com.jme3.util.MaterialDebugAppState;
import com.jme3.util.TangentBinormalGenerator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Nehon
 */
public class MaterialPreviewWidget extends javax.swing.JPanel {

    private boolean init=false;
    private MaterialPreviewRenderer matRenderer;
    /** Creates new form MaterialPreviewWidget */
    public MaterialPreviewWidget() {
        initComponents();        
    }

    private  void initWidget() {
        sphereButton.setSelected(true);
        matRenderer = new MaterialPreviewRenderer(previewLabel);
        init=true;
    }

    @SuppressWarnings("unchecked")
    public void showMaterial(ProjectAssetManager assetManager, String materialFileName) {
        if(!init){
            initWidget();
        }        
        matRenderer.showMaterial(assetManager, materialFileName);
    }

    public void clear() {
        previewLabel.setIcon(null);
    }

    public void sceneOpened(SceneRequest request) {
    }

    public void sceneClosed(SceneRequest request) {
    }

    public void cleanUp(){
         matRenderer.cleanUp();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        toggleButtonGroup = new javax.swing.ButtonGroup();
        previewLabel = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        sphereButton = new javax.swing.JToggleButton();
        cubeButton = new javax.swing.JToggleButton();
        planeButton = new javax.swing.JToggleButton();

        previewLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        previewLabel.setText(org.openide.util.NbBundle.getMessage(MaterialPreviewWidget.class, "MaterialPreviewWidget.previewLabel.text")); // NOI18N
        previewLabel.setMaximumSize(new java.awt.Dimension(120, 120));
        previewLabel.setMinimumSize(new java.awt.Dimension(120, 120));

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        toggleButtonGroup.add(sphereButton);
        sphereButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jme3/gde/materials/multiview/widgets/icons/sphere.png"))); // NOI18N
        sphereButton.setSelected(true);
        sphereButton.setText(org.openide.util.NbBundle.getMessage(MaterialPreviewWidget.class, "MaterialPreviewWidget.sphereButton.text")); // NOI18N
        sphereButton.setToolTipText(org.openide.util.NbBundle.getMessage(MaterialPreviewWidget.class, "MaterialPreviewWidget.sphereButton.toolTipText")); // NOI18N
        sphereButton.setFocusable(false);
        sphereButton.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        sphereButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sphereButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        sphereButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sphereButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(sphereButton);

        toggleButtonGroup.add(cubeButton);
        cubeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jme3/gde/materials/multiview/widgets/icons/box.png"))); // NOI18N
        cubeButton.setText(org.openide.util.NbBundle.getMessage(MaterialPreviewWidget.class, "MaterialPreviewWidget.cubeButton.text")); // NOI18N
        cubeButton.setToolTipText(org.openide.util.NbBundle.getMessage(MaterialPreviewWidget.class, "MaterialPreviewWidget.cubeButton.toolTipText")); // NOI18N
        cubeButton.setFocusable(false);
        cubeButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cubeButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cubeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cubeButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(cubeButton);

        toggleButtonGroup.add(planeButton);
        planeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jme3/gde/materials/multiview/widgets/icons/plane.png"))); // NOI18N
        planeButton.setText(org.openide.util.NbBundle.getMessage(MaterialPreviewWidget.class, "MaterialPreviewWidget.planeButton.text")); // NOI18N
        planeButton.setToolTipText(org.openide.util.NbBundle.getMessage(MaterialPreviewWidget.class, "MaterialPreviewWidget.planeButton.toolTipText")); // NOI18N
        planeButton.setFocusable(false);
        planeButton.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        planeButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        planeButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        planeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                planeButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(planeButton);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(previewLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(previewLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

private void sphereButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sphereButtonActionPerformed
    matRenderer.switchDisplay(MaterialPreviewRenderer.DisplayType.Sphere);
}//GEN-LAST:event_sphereButtonActionPerformed

private void cubeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cubeButtonActionPerformed
    matRenderer.switchDisplay(MaterialPreviewRenderer.DisplayType.Box);
}//GEN-LAST:event_cubeButtonActionPerformed

private void planeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_planeButtonActionPerformed
    matRenderer.switchDisplay(MaterialPreviewRenderer.DisplayType.Quad);
}//GEN-LAST:event_planeButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton cubeButton;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToggleButton planeButton;
    private javax.swing.JLabel previewLabel;
    private javax.swing.JToggleButton sphereButton;
    private javax.swing.ButtonGroup toggleButtonGroup;
    // End of variables declaration//GEN-END:variables
}
