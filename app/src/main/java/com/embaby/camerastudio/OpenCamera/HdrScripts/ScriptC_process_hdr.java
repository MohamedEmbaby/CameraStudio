/*
 * Copyright (C) 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * DO NOT MODIFY!
 * The source Renderscript file: \process_hdr.rs
 */

package com.embaby.camerastudio.OpenCamera.HdrScripts;

import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.FieldPacker;
import android.renderscript.RSRuntimeException;
import android.renderscript.RenderScript;
import android.renderscript.ScriptC;
import android.renderscript.Type;

/**
 * @hide
 */
public class ScriptC_process_hdr extends ScriptC {
    private static final String __rs_resource_name = "process_hdr";
    // Constructor
    public  ScriptC_process_hdr(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              process_hdrBitCode.getBitCode32(),
              process_hdrBitCode.getBitCode64());
        __ALLOCATION = Element.ALLOCATION(rs);
        mExportVar_offset_x0 = 0;
        __I32 = Element.I32(rs);
        mExportVar_offset_y0 = 0;
        mExportVar_offset_x2 = 0;
        mExportVar_offset_y2 = 0;
        mExportVar_parameter_A0 = 1.f;
        __F32 = Element.F32(rs);
        mExportVar_parameter_B0 = 0.f;
        mExportVar_parameter_A1 = 1.f;
        mExportVar_parameter_B1 = 0.f;
        mExportVar_parameter_A2 = 1.f;
        mExportVar_parameter_B2 = 0.f;
        mExportVar_weight_scale_c = 0.00778162247f;
        mExportVar_tonemap_algorithm_clamp_c = 0;
        mExportVar_tonemap_algorithm_exponential_c = 1;
        mExportVar_tonemap_algorithm_reinhard_c = 2;
        mExportVar_tonemap_algorithm_filmic_c = 3;
        mExportVar_tonemap_algorithm_aces_c = 4;
        mExportVar_tonemap_algorithm = 2;
        mExportVar_tonemap_scale = 1.f;
        mExportVar_W = 11.1999998f;
        __U8_4 = Element.U8_4(rs);
    }

    private Element __ALLOCATION;
    private Element __F32;
    private Element __I32;
    private Element __U8_4;
    private FieldPacker __rs_fp_ALLOCATION;
    private FieldPacker __rs_fp_F32;
    private FieldPacker __rs_fp_I32;
    private final static int mExportVarIdx_bitmap0 = 0;
    private Allocation mExportVar_bitmap0;
    public synchronized void set_bitmap0(Allocation v) {
        setVar(mExportVarIdx_bitmap0, v);
        mExportVar_bitmap0 = v;
    }

    public Allocation get_bitmap0() {
        return mExportVar_bitmap0;
    }

    public FieldID getFieldID_bitmap0() {
        return createFieldID(mExportVarIdx_bitmap0, null);
    }

    private final static int mExportVarIdx_bitmap2 = 1;
    private Allocation mExportVar_bitmap2;
    public synchronized void set_bitmap2(Allocation v) {
        setVar(mExportVarIdx_bitmap2, v);
        mExportVar_bitmap2 = v;
    }

    public Allocation get_bitmap2() {
        return mExportVar_bitmap2;
    }

    public FieldID getFieldID_bitmap2() {
        return createFieldID(mExportVarIdx_bitmap2, null);
    }

    private final static int mExportVarIdx_offset_x0 = 2;
    private int mExportVar_offset_x0;
    public synchronized void set_offset_x0(int v) {
        setVar(mExportVarIdx_offset_x0, v);
        mExportVar_offset_x0 = v;
    }

    public int get_offset_x0() {
        return mExportVar_offset_x0;
    }

    public FieldID getFieldID_offset_x0() {
        return createFieldID(mExportVarIdx_offset_x0, null);
    }

    private final static int mExportVarIdx_offset_y0 = 3;
    private int mExportVar_offset_y0;
    public synchronized void set_offset_y0(int v) {
        setVar(mExportVarIdx_offset_y0, v);
        mExportVar_offset_y0 = v;
    }

    public int get_offset_y0() {
        return mExportVar_offset_y0;
    }

    public FieldID getFieldID_offset_y0() {
        return createFieldID(mExportVarIdx_offset_y0, null);
    }

    private final static int mExportVarIdx_offset_x2 = 4;
    private int mExportVar_offset_x2;
    public synchronized void set_offset_x2(int v) {
        setVar(mExportVarIdx_offset_x2, v);
        mExportVar_offset_x2 = v;
    }

    public int get_offset_x2() {
        return mExportVar_offset_x2;
    }

    public FieldID getFieldID_offset_x2() {
        return createFieldID(mExportVarIdx_offset_x2, null);
    }

    private final static int mExportVarIdx_offset_y2 = 5;
    private int mExportVar_offset_y2;
    public synchronized void set_offset_y2(int v) {
        setVar(mExportVarIdx_offset_y2, v);
        mExportVar_offset_y2 = v;
    }

    public int get_offset_y2() {
        return mExportVar_offset_y2;
    }

    public FieldID getFieldID_offset_y2() {
        return createFieldID(mExportVarIdx_offset_y2, null);
    }

    private final static int mExportVarIdx_parameter_A0 = 6;
    private float mExportVar_parameter_A0;
    public synchronized void set_parameter_A0(float v) {
        setVar(mExportVarIdx_parameter_A0, v);
        mExportVar_parameter_A0 = v;
    }

    public float get_parameter_A0() {
        return mExportVar_parameter_A0;
    }

    public FieldID getFieldID_parameter_A0() {
        return createFieldID(mExportVarIdx_parameter_A0, null);
    }

    private final static int mExportVarIdx_parameter_B0 = 7;
    private float mExportVar_parameter_B0;
    public synchronized void set_parameter_B0(float v) {
        setVar(mExportVarIdx_parameter_B0, v);
        mExportVar_parameter_B0 = v;
    }

    public float get_parameter_B0() {
        return mExportVar_parameter_B0;
    }

    public FieldID getFieldID_parameter_B0() {
        return createFieldID(mExportVarIdx_parameter_B0, null);
    }

    private final static int mExportVarIdx_parameter_A1 = 8;
    private float mExportVar_parameter_A1;
    public synchronized void set_parameter_A1(float v) {
        setVar(mExportVarIdx_parameter_A1, v);
        mExportVar_parameter_A1 = v;
    }

    public float get_parameter_A1() {
        return mExportVar_parameter_A1;
    }

    public FieldID getFieldID_parameter_A1() {
        return createFieldID(mExportVarIdx_parameter_A1, null);
    }

    private final static int mExportVarIdx_parameter_B1 = 9;
    private float mExportVar_parameter_B1;
    public synchronized void set_parameter_B1(float v) {
        setVar(mExportVarIdx_parameter_B1, v);
        mExportVar_parameter_B1 = v;
    }

    public float get_parameter_B1() {
        return mExportVar_parameter_B1;
    }

    public FieldID getFieldID_parameter_B1() {
        return createFieldID(mExportVarIdx_parameter_B1, null);
    }

    private final static int mExportVarIdx_parameter_A2 = 10;
    private float mExportVar_parameter_A2;
    public synchronized void set_parameter_A2(float v) {
        setVar(mExportVarIdx_parameter_A2, v);
        mExportVar_parameter_A2 = v;
    }

    public float get_parameter_A2() {
        return mExportVar_parameter_A2;
    }

    public FieldID getFieldID_parameter_A2() {
        return createFieldID(mExportVarIdx_parameter_A2, null);
    }

    private final static int mExportVarIdx_parameter_B2 = 11;
    private float mExportVar_parameter_B2;
    public synchronized void set_parameter_B2(float v) {
        setVar(mExportVarIdx_parameter_B2, v);
        mExportVar_parameter_B2 = v;
    }

    public float get_parameter_B2() {
        return mExportVar_parameter_B2;
    }

    public FieldID getFieldID_parameter_B2() {
        return createFieldID(mExportVarIdx_parameter_B2, null);
    }

    private final static int mExportVarIdx_weight_scale_c = 12;
    private float mExportVar_weight_scale_c;
    public final static float const_weight_scale_c = 0.00778162247f;
    public float get_weight_scale_c() {
        return mExportVar_weight_scale_c;
    }

    public FieldID getFieldID_weight_scale_c() {
        return createFieldID(mExportVarIdx_weight_scale_c, null);
    }

    private final static int mExportVarIdx_tonemap_algorithm_clamp_c = 13;
    private int mExportVar_tonemap_algorithm_clamp_c;
    public final static int const_tonemap_algorithm_clamp_c = 0;
    public int get_tonemap_algorithm_clamp_c() {
        return mExportVar_tonemap_algorithm_clamp_c;
    }

    public FieldID getFieldID_tonemap_algorithm_clamp_c() {
        return createFieldID(mExportVarIdx_tonemap_algorithm_clamp_c, null);
    }

    private final static int mExportVarIdx_tonemap_algorithm_exponential_c = 14;
    private int mExportVar_tonemap_algorithm_exponential_c;
    public final static int const_tonemap_algorithm_exponential_c = 1;
    public int get_tonemap_algorithm_exponential_c() {
        return mExportVar_tonemap_algorithm_exponential_c;
    }

    public FieldID getFieldID_tonemap_algorithm_exponential_c() {
        return createFieldID(mExportVarIdx_tonemap_algorithm_exponential_c, null);
    }

    private final static int mExportVarIdx_tonemap_algorithm_reinhard_c = 15;
    private int mExportVar_tonemap_algorithm_reinhard_c;
    public final static int const_tonemap_algorithm_reinhard_c = 2;
    public int get_tonemap_algorithm_reinhard_c() {
        return mExportVar_tonemap_algorithm_reinhard_c;
    }

    public FieldID getFieldID_tonemap_algorithm_reinhard_c() {
        return createFieldID(mExportVarIdx_tonemap_algorithm_reinhard_c, null);
    }

    private final static int mExportVarIdx_tonemap_algorithm_filmic_c = 16;
    private int mExportVar_tonemap_algorithm_filmic_c;
    public final static int const_tonemap_algorithm_filmic_c = 3;
    public int get_tonemap_algorithm_filmic_c() {
        return mExportVar_tonemap_algorithm_filmic_c;
    }

    public FieldID getFieldID_tonemap_algorithm_filmic_c() {
        return createFieldID(mExportVarIdx_tonemap_algorithm_filmic_c, null);
    }

    private final static int mExportVarIdx_tonemap_algorithm_aces_c = 17;
    private int mExportVar_tonemap_algorithm_aces_c;
    public final static int const_tonemap_algorithm_aces_c = 4;
    public int get_tonemap_algorithm_aces_c() {
        return mExportVar_tonemap_algorithm_aces_c;
    }

    public FieldID getFieldID_tonemap_algorithm_aces_c() {
        return createFieldID(mExportVarIdx_tonemap_algorithm_aces_c, null);
    }

    private final static int mExportVarIdx_tonemap_algorithm = 18;
    private int mExportVar_tonemap_algorithm;
    public synchronized void set_tonemap_algorithm(int v) {
        setVar(mExportVarIdx_tonemap_algorithm, v);
        mExportVar_tonemap_algorithm = v;
    }

    public int get_tonemap_algorithm() {
        return mExportVar_tonemap_algorithm;
    }

    public FieldID getFieldID_tonemap_algorithm() {
        return createFieldID(mExportVarIdx_tonemap_algorithm, null);
    }

    private final static int mExportVarIdx_tonemap_scale = 19;
    private float mExportVar_tonemap_scale;
    public synchronized void set_tonemap_scale(float v) {
        setVar(mExportVarIdx_tonemap_scale, v);
        mExportVar_tonemap_scale = v;
    }

    public float get_tonemap_scale() {
        return mExportVar_tonemap_scale;
    }

    public FieldID getFieldID_tonemap_scale() {
        return createFieldID(mExportVarIdx_tonemap_scale, null);
    }

    private final static int mExportVarIdx_W = 20;
    private float mExportVar_W;
    public final static float const_W = 11.1999998f;
    public float get_W() {
        return mExportVar_W;
    }

    public FieldID getFieldID_W() {
        return createFieldID(mExportVarIdx_W, null);
    }

    //private final static int mExportForEachIdx_root = 0;
    private final static int mExportForEachIdx_hdr = 1;
    public KernelID getKernelID_hdr() {
        return createKernelID(mExportForEachIdx_hdr, 59, null, null);
    }

    public void forEach_hdr(Allocation ain, Allocation aout) {
        forEach_hdr(ain, aout, null);
    }

    public void forEach_hdr(Allocation ain, Allocation aout, LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_hdr, ain, aout, null, sc);
    }

}

