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
 * The source Renderscript file: \create_mtb.rs
 */

package com.embaby.camerastudio.OpenCamera.HdrScripts;

/**
 * @hide
 */
public class create_mtbBitCode {
    // return byte array representation of the 32-bit bitcode.
    public static byte[] getBitCode32() {
        return getBitCode32Internal();
    };

    private static byte[] getSegment32_0() {
        byte[] data = {
             -34,  -64,   23,   11,    0,    0,    0,    0,   44,    0,    0,    0,    8,    7,    0,    0,
               0,    0,    0,    0,   21,    0,    0,    0,    0,    0,    0,    0,    1,   64,    4,    0,
             106,    9,    0,    0,    2,   64,    4,    0,    3,    0,    0,    0,   66,   67,  -64,  -34,
              33,   12,    0,    0,  -65,    1,    0,    0,    1,   16,    0,    0,   18,    0,    0,    0,
               7, -127,   35, -111,   65,  -56,    4,   73,    6,   16,   50,   57, -110,    1, -124,   12,
              37,    5,    8,   25,   30,    4, -117,   98, -128,   20,   69,    2,   66, -110,   11,   66,
             -92,   16,   50,   20,   56,    8,   24,   73,   10,   50,   68,   36,   72,   10, -112,   33,
              35,  -60,   82, -128,   12,   25,   33,  114,   36,    7,  -56,   72,   17,   98,  -88,  -96,
             -88,   64,  -58,  -16,    1,    0,    0,    0,   73,   24,    0,    0,   19,    0,    0,    0,
              11, -124,   -1,   -1,   -1,   -1,   31,  -64,   96,    1,    2,    4,   65,   32,    4,   -1,
              -1,   -1,   -1,   63, -128,  -47,    2,   66,    8,   -2,   -1,   -1,   -1,  127,    0,   22,
               8,   -1,   -1,   -1,   -1,   63,    0,   11,   16,   32,    8,    2,   33,   -8,   -1,   -1,
              -1,   -1,    1, -116,   22,   16,   66,  -16,   -1,   -1,   -1,   -1,    3,   24,   44,   32,
               2,  -32,   -1,   -1,   -1,   -1,    7,   48,    0,    0,    0,    0, -119,   32,    0,    0,
              25,    0,    0,    0,   50,   34,   72,    9,   32,  100, -123,    4, -109,   34,  -92, -124,
               4, -109,   34,  -29, -124,  -95, -112,   20,   18,   76, -118, -116,   11, -124,  -92,   76,
              16,   84,  115,    4,   96,   64,  -32,   44,  105, -118,   40,   97,  -14,   35,  -23,    7,
            -106,  -59,   17, -128,    9,  113,   26,  -97,   70,   65,   32,   49,    2,   48,   71, -128,
              12,   35,   16,   69,   33, -120,    1, -128,   78,   25,   74,   41, -108,   50,    0, -108,
            -126,  -84,    2,    0,  -79,   18,   16,  114,   69,   32, -125,  -32,   64,  -64,   28,    1,
              40,  -52,   17,    4,    0,    0,    0,    0,   19,  -80,  112, -112, -121,  118,  -80, -121,
              59,  104,    3,  119,  120,    7,  119,   40, -121,   54,   96, -121,  116,  112, -121,  122,
             -64, -121,   54,   56,    7,  119,  -88, -121,  114,    8,    7,  113,   72, -121,   13,  100,
              80,   14,  109,    0,   15,  122,   48,    7,  114,  -96,    7,  115,   32,    7,  109, -112,
              14,  118,   64,    7,  122,   96,    7,  116,  -48,    6,  -10,   16,    7,  114, -128,    7,
             122,   96,    7,  116,  -96,    7,  113,   32,    7,  120,  -48,    6,  -18,   48,    7,  114,
             -48,    6,  -77,   96,    7,  116,  -96,  -13,   64, -124,    4,   50,   66,   68,    4,  -40,
             -95,    4, -128,    2,   12,    0,    0,    4,  -64,   14,   37,    0,   20,   96,    0,    0,
              32,    0,  118,   40,    1,  -96,    0,    3,    0,    0,    1,  -64,   57,   -8,   16,    5,
               1,    0,   32,    0,    0,    0,    8, -122,   40,   10,   16,    0,    2,    0,    0,   64,
              48,   68,  105, -128,    0,   24,    0,    0,    0, -126,   33,  -54,    3,    0,   64,    0,
               0,    0,   16,   12,   81,   34,   32,    0,    8,    0,    0, -128,   32,   11,    4,    0,
               7,    0,    0,    0,   50,   30, -104,   16,   25,   17,   76, -112, -116,    9,   38,   71,
             -58,    4,   67,    2,   35,    0,   37,   80,    8,   52,   71,    0,   72, -116,    0,    0,
             121,   24,    0,    0, -127,    0,    0,    0,   26,    3,   76, -112,   70,    2,   19,   52,
              68,    0,   20,   42,  119,   99,  104,   97,  114,   95,  115,  105,  122,  101,   67,    4,
              96,   25,   98,    0, -118,   20,    0,   11, -101,  -74,   52,  -73,  -81,   50,  -73,  -70,
             -74,  -81,  -71,   52,  -67,  -78,   33,    6,  -96,   72,    4,  -80, -112,   15, -126,  -36,
             -56,  -28,  -34,  -46,  -56,   64,  -58,  -40,  -62,  -36,  -50,   64,  -20,  -54,  -28,  -26,
             -46,  -34,  -36,   64,  102,   92,  112,   92,  100,  110,  106,  104,  112,   96,   64,   64,
              80,  -60,  -62,  -26,  -54,  -56,   64,  -34,  -36,   64, -104, -104,  -84, -102,   64,  102,
              92,  112,   92,  100,  110,  106,  104,  112,   96,   82, -122,    8, -110,  -63,  -61,  -82,
              76,  110,   46,  -19,  -51, -115,   65,  -52,   16,   66,   66,  -92, -124, -111,   90, -104,
              93,  -40,   23,   92,  -40,  -40,   90,  -40,   89,  -39, -105,   91,   88,   91,   25,   53,
             -73,   50,   58, -105,  -71,  -73,   58,  -71,  -79,   50,  -77,   55,  -71,  -77,   50, -105,
              55,  -72,   50,  -73,  -79,  -80,  -74,   50,  -71,  -80,   33, -124,  -76,   72,   12,   27,
             -71,  -71,   47,   51,  -72,   47,  -71,   50,  -74,   48,  -68,   50,   50,    2,   67,    8,
             -55, -111,   30,   42,  111,  117,  116,   95,   98,  105,  116,  109,   97,  112,   20,  100,
              96, -122,   16,   82,   36,   73,  100,  -38,  -54,  -56,  -46,  -62,  -36,  -66,  -20,  -62,
             -40,  -22,  -54,   24,  -44,   12,   33,   36,   74,  -86,  120,  -52,  -47, -123,  -55,  -47,
             125,  -31,   13,   33,  -92,   75,  -86,  120,  -52,  -47, -123,  -55,  -47,  125,  -27,   13,
              33,  -92,   76,  -86,   24,  -64,   12,   17,  -92, -115, -124,  -36,  -37,   27,  -35,   16,
              65,  -22,  -88, -116,  -55, -107, -123,  -47, -107,  125,  -75,  -47, -119,   13,   17,  -92,
            -113,   66,  -51,  -51,   16,   65,   10,    3,   14,  105,  110,  116,  124,  -34,  -38,  -36,
             -46,  -32,  -34,  -24,  -54,  -36,  -24,   64,  -58,  -48,  -62,  -28,   24,   77,  -91,  -75,
             -63,  -79, -107, -127,   12,  -67,   12,  -83,  -84, -128,   80,    9,    5,    5,   13,   17,
             -92,   50,   24,   34,   76,  -52,   16,   67,   34,    3,  -55,   12,   38,  102, -120,   33,
            -115, -127, -124,    6,   19,   51,  -60, -112,  -46,   64,   74, -125, -119,  105,  -60,  -58,
             102,  -41,  -26,  -46,  -10,   70,   86,  -57,   86,  -26,   98,  -58,   22,  118,   54,   55,
              69,   24, -118,   42,  108,  108,  118,  109,   46,  105,  100,  101,  110,  116,   83, -126,
             -93,  -57,    8, -100,   92,  -40,   89,   91,  -40, -108,   65,  105,  -96,   58,   35,  114,
             115,   95,  101,  120,  112,  111,  114,  116,   95,  118,   97,  114,   83, -120,  -55,  -62,
             -76,   66,   35,  114,  115,   95,  111,   98,  106,  101,   99,  116,   95,  115,  108,  111,
             116,  115,   83,    2,  -82,  -41, -120,  -36,  -36,   87,   25,   30,  -36, -101,   28,  -35,
            -105,  -39, -101,   92,   89,  -40,   24,  -38, -105,   91,   88,   91,  -39,   20,  -63,    3,
            -125,   74,   35,  114,  115,   95,  101,  120,  112,  111,  114,  116,   95,  102,  111,  114,
             101,   97,   99,  104,   83,    4,   78,   12,    0,    0,    0,    0,  121,   24,    0,    0,
              92,    0,    0,    0,   51,    8, -128,   28,  -60,  -31,   28,  102,   20,    1,   61, -120,
              67,   56, -124,  -61, -116,   66, -128,    7,  121,  120,    7,  115, -104,  113,   12,  -26,
               0,   15,  -19,   16,   14,  -12, -128,   14,   51,   12,   66,   30,  -62,  -63,   29,  -50,
             -95,   28,  102,   48,    5,   61, -120,   67,   56, -124, -125,   27,  -52,    3,   61,  -56,
              67,   61, -116,    3,   61,  -52,  120, -116,  116,  112,    7,  123,    8,    7,  121,   72,
            -121,  112,  112,    7,  122,  112,    3,  118,  120, -121,  112,   32, -121,   25,  -52,   17,
              14,  -20, -112,   14,  -31,   48,   15,  110,   48,   15,  -29,  -16,   14,  -16,   80,   14,
              51,   16,  -60,   29,  -34,   33,   28,  -40,   33,   29,  -62,   97,   30,  102,   48, -119,
              59,  -68, -125,   59,  -48,   67,   57,  -76,    3,   60,  -68, -125,   60, -124,    3,   59,
             -52,  -16,   20,  118,   96,    7,  123,  104,    7,   55,  104, -121,  114,  104,    7,   55,
            -128, -121,  112, -112, -121,  112,   96,    7,  118,   40,    7,  118,   -8,    5,  118,  120,
            -121,  119, -128, -121,   95,    8, -121,  113,   24, -121,  114, -104, -121,  121, -104, -127,
              44,  -18,  -16,   14,  -18,  -32,   14,  -11,  -64,   14,  -20,   48,    3,   98,  -56,  -95,
              28,  -28,  -95,   28,  -52,  -95,   28,  -28,  -95,   28,  -36,   97,   28,  -54,   33,   28,
             -60, -127,   29,  -54,   97,    6,  -42, -112,   67,   57,  -56,   67,   57, -104,   67,   57,
             -56,   67,   57,  -72,  -61,   56, -108,   67,   56, -120,    3,   59, -108,  -61,   47,  -68,
            -125,   60,   -4, -126,   59,  -44,    3,   59,  -80,  -61,   12,  -57,  105, -121,  112,   88,
            -121,  114,  112, -125,  116,  104,    7,  120,   96, -121,  116,   24, -121,  116,  -96, -121,
              25,  -50,   83,   15,  -18,    0,   15,  -14,   80,   14,  -28, -112,   14,  -29,   64,   15,
             -31,   32,   14,  -20,   80,   14,   51,   32,   40,   29,  -36,  -63,   30,  -62,   65,   30,
             -46,   33,   28,  -36, -127,   30,  -36,  -32,   28,  -28,  -31,   29,  -22,    1,   30,  102,
              24,   81,   56,  -80,   67,   58, -100, -125,   59,  -52,   80,   36,  118,   96,    7,  123,
             104,    7,   55,   96, -121,  119,  120,    7,  120, -104,   81,   76,  -12, -112,   15,  -16,
              80,   14,    0,    0,  113,   32,    0,    0,   32,    0,    0,    0,   86, -128,   -4,  -13,
             -51,    0,  -41,  113,   88,  -64,   33,   77,   64,   52,   -3, -105,    9,   28,  -46,    4,
              68,  -45, -113,   25, -127,   34,   68,    4,   48,   17,   63,   51,    5,  102,  -96,    6,
              -1,  108,  -45, -111,  -60,   18, -109,  -73,   16,   12,  -47,   76,  -38,  -12,   83,  -62,
               1,   68,  -11,   29,   73,   63,  -80,   44, -114,    0,   76, -120,  -45,   28,   73,   98,
               0,   12,   67,   12,    8,  -48,   -4,   21,  -80,   80, -124,   29,   32,  126,   36,   -7,
             -61,  -28,   68,   54,  -96,   56,  -44,  -12,    7,  -56,  -60,    0, -113,   33, -124,  -63,
              63,  -41,  119,   36,  113,   11,    1,   68,  104, -112,   16,  -62, -108,  -42,  119,   36,
              -3,  -64,  -78,   56,    2,   48,   33,   78,    3,    0,    0,    0,   97,   32,    0,    0,
              58,    0,    0,    0,   19,    4,   65,   44,   16,    0,    0,    0,    4,    0,    0,    0,
               4, -118,  -96,   20,  -88, -108,  127,    0,    5,  -37,   49,   64,  107,    6,    0,    0,
              99,    8,   78,   50, -122,  -32,   40,   35,    6,   69,   17,   20,  -42,   53, -122,  -32,
              68,   35,    6,   69,   17,   20,   88,  118,   26,    8,    2,  -58,  112,  -61,  -58, -103,
            -127,  109,   92,    8, -116,  -37,   66,   48,  -35,  -32,  125,  -35,  112,    3,   24,   72,
             104,  112,   93, -111,  -23, -122,   73,   12,  -62, -128, -126,   81,   15,   25,    4,    9,
             -93,   32,   51,    8,  -94,  -58,  108,   67, -123,    6,  -64, -120,  -63,   97,    4,   70,
              26, -116,   65,   25, -100,    1, -122,    3,    1,    0,    0,    0,   20,    0,    0,    0,
              22,   66,    8,  -52,  -93,  -37,    6,   33,   56,   77,  101,   35, -126,  -17,  -37,    7,
              33,   81,   65,  110,   29, -125,  -64,   60,  -26,   49,   72,   84,   96,   37, -123,   68,
               5,  117,  109,   26, -123,    0,   44,   75,  109,   39, -123,   68,    5,  -75,  109,   34,
            -127,  111,   40, -121,   79,   53,   15,   32,   40,  -26,   32,   32, -115,   61,    4, -105,
              65,    4, -104, -127,   24,    3,   82,   20,   62,  109,   24, -124,    0,   44,   11,    0,
               1,   49,    0,    0,    4,    0,    0,    0,   91,    6,   35,   80, -125,   45, -125,   19,
             -88,  -63, -106,    1,   10,  -44,    0,    0,    0,    0,    0,    0,   97,   32,    0,    0,
               3,    0,    0,    0,   19,    4,  -63, -120,    1,  113,    4,  -56, -128,    0,    0,    0,
               0,    0,    0,    0,
        };
        return data;
    }

    private static int bitCode32Length = 1844;

    private static byte[] getBitCode32Internal() {
        byte[] bc = new byte[bitCode32Length];
        int offset = 0;
        byte[] seg;
        seg = getSegment32_0();
        System.arraycopy(seg, 0, bc, offset, seg.length);
        offset += seg.length;
        return bc;
    }

    // return byte array representation of the 64-bit bitcode.
    public static byte[] getBitCode64() {
        return getBitCode64Internal();
    };

    private static byte[] getSegment64_0() {
        byte[] data = {
             -34,  -64,   23,   11,    0,    0,    0,    0,   44,    0,    0,    0,   92,    7,    0,    0,
               0,    0,    0,    0,   21,    0,    0,    0,    0,    0,    0,    0,    1,   64,    4,    0,
             106,    9,    0,    0,    2,   64,    4,    0,    3,    0,    0,    0,   66,   67,  -64,  -34,
              33,   12,    0,    0,  -44,    1,    0,    0,    1,   16,    0,    0,   18,    0,    0,    0,
               7, -127,   35, -111,   65,  -56,    4,   73,    6,   16,   50,   57, -110,    1, -124,   12,
              37,    5,    8,   25,   30,    4, -117,   98, -128,   20,   69,    2,   66, -110,   11,   66,
             -92,   16,   50,   20,   56,    8,   24,   73,   10,   50,   68,   36,   72,   10, -112,   33,
              35,  -60,   82, -128,   12,   25,   33,  114,   36,    7,  -56,   72,   17,   98,  -88,  -96,
             -88,   64,  -58,  -16,    1,    0,    0,    0,   73,   24,    0,    0,   17,    0,    0,    0,
              11, -124,   -1,   -1,   -1,   -1,   31,  -64,   96, -127,  -16,   -1,   -1,   -1,   -1,    3,
              24,   45,   16,   -2,   -1,   -1,   -1,  127,    0,   22,   24,    1,    8, -126,   32,    8,
              18,    2,    8, -126,   32,    8,   18,   -1,   -1,   -1,   -1,   63, -128,  -63,    2,  -31,
              -1,   -1,   -1,   -1,    7,   48,   90,   64,    4,  -64,   -1,   -1,   -1,   -1,   15,   96,
               0,    0,    0,    0, -119,   32,    0,    0,   27,    0,    0,    0,   50,   34,   72,    9,
              32,  100, -123,    4, -109,   34,  -92, -124,    4, -109,   34,  -29, -124,  -95, -112,   20,
              18,   76, -118, -116,   11, -124,  -92,   76,   16,   96,  115,    4,   96,   64,   96, -114,
               0,   20,   72, -100,   37,   77,   17,   37,   76,  126,   36,   -3,  -64,  -78,   56,    2,
              48,   33,   78,  -29,  -29, -120,   24,   99,   12,   34,   35,    0, -123,   48,    0,    0,
              58,  115,    4,   72,   25,   82,   74,  -92,   74,   97,   74,    2, -128,   24,  -91,   57,
            -126,  -96,   24,  -58,   57,    1,   30,  -63,   18,   24, -110,   69,   48, -123,  -24,   64,
             -64,   48,    2, -111,    0,    0,    0,    0,   19,  -76,  112,    8,    7,  121,   24,    7,
             116,  -80,    3,   58,  104,    3,  119,  120,    7,  119,   40, -121,   54,   96, -121,  116,
             112, -121,  122,  -64, -121,   54,   56,    7,  119,  -88, -121,  114,    8,    7,  113,   72,
            -121,   13,  115,   80,   14,  109,  -48,   14,  122,   80,   14,  109, -112,   14,  120,  -96,
               7,  120,  -96,    7,  115,   32,    7,  109, -112,   14,  113,   96,    7,  122,   16,    7,
             118,  -96,    7,  115,   32,    7,  109, -112,   14,  118,   64,    7,  122,   96,    7,  116,
             -48,    6,  -23,   16,    7,  114, -128,    7,  122,   16,    7,  114, -128,    7,  109,  -32,
              14,  115,   32,    7,  122,   96,    7,  116,  -48,    6,  -77,   16,    7,  114, -128,    7,
              58,   15,  100,   72,   32,   35,   68,   70, -128,   29,   74,    0,   44,  -64,    0,    0,
              64,    0,  -20,   80,    2,   96,    1,    6,    0,    0,    2,   96, -121,   18,    0,   11,
              48,    0,    0,   16,    0,   44,    8,   57,   68,   65,    0,    0,    8,    0,    0,    0,
            -126,   33,  -54,    2,    4, -128,    0,    0,    0,   16,   12,   81,   26,   32,    0,    6,
               0,    0, -128,   96, -120,   18,    1,    1,   64,    0,    0,    0,    0,   67, -108,    9,
               0, -128,    0,    0,    0,   32,   24,  -94,   84,   64,    0,   12,    0,    0,    0,   65,
              22,    8,    0,    0,    8,    0,    0,    0,   50,   30, -104,   20,   25,   17,   76, -112,
            -116,    9,   38,   71,  -58,    4,   67,    2,   35,    0,   36,   70,    0,   10,  -94,   64,
              10, -122,  -56,    8,    0,    0,    0,    0,  121,   24,    0,    0,  126,    0,    0,    0,
              26,    3,   76, -112,   70,    2,   19,   68,   62,    8,  114,   35, -109,  123,   75,   35,
               3,   25,   99,   11,  115,   59,    3,  -79,   43, -109, -101,   75,  123,  115,    3, -103,
             113,  -63,  113, -111,  -71,  -87,  -95,  -63, -127,    1,    1,   65,   17,   11, -101,   43,
              35,    3,  121,  115,    3,   97,   98,  -78,  106,    2, -103,  113,  -63,  113, -111,  -71,
             -87,  -95,  -63, -127,   73,   25,   34,   88,    0,   15,  -69,   50,  -71,  -71,  -76,   55,
              55,    6,   49,   67,    8,   75,  -80,    6,   70,  106,   97,  118,   97,   95,  112,   97,
              99,  107,   97,  103,  101,   95,  110,   97,  109,  101,  -44,  -36,  -54,  -24,   92,  -26,
             -34,  -22,  -28,  -58,  -54,  -52,  -34,  -28,  -50,  -54,   92,  -34,  -32,  -54,  -36,  -58,
             -62,  -38,  -54,  -28,  -62, -122,   16,   86,   97,   25,  108,  -28,  -26,  -66,  -52,  -32,
             -66,  -28,  -54,  -40,  -62,  -16,  -54,  -56,    8,   12,   33,   44,  -60,   74,  -88,  -68,
             -43,  -47,  125, -119,  -91,  -47,  -75, -123,  -63,   81, -112, -127,   25,   66,   88, -117,
             -59, -112,  105,   43,   35,   75,   11,  115,   -5,  -78,   11,   99,  -85,   43,   99,   80,
              51, -124,  -80,   28,  -21,  -31,   49,   71,   23,   38,   71,   -9, -123,   55, -124,  -80,
              34,  -21,  -31,   49,   71,   23,   38,   71,   -9, -107,   55, -124,  -80,   38,  -21,   97,
               0,   51,   68,  -80,   42,   18,  114,  111,  111,  116,   67,    4,  -21,  -94,   50,   38,
              87,   22,   70,   87,  -10,  -43,   70,   39,   54,   68,  -80,   50,   10,   53,   55,   67,
               4,  107,  -29, -112,  -26,   70,  -57,  -25,  -83,  -51,   45,   13,  -18, -115,  -82,  -52,
            -115,   14,  100,   12,   45,   76, -114,  -47,   84,   90,   27,   28,   91,   25,  -56,  -48,
             -53,  -48,  -54,   10,    8, -107,   80,   80,  -48,   16,  -63,   -6, -122,    8,  -62,   50,
             -60,  -80,   60,   11,   12, -124,  101, -120,   97,  117, -106,   24,    8,  -53,   16,  -61,
              26,    3,  107,   12, -124,  101, -120,   32,   48,   92,  -62,  -36,  -14,   64,  -32,  -34,
             -46,  -36,  -24,  -54,  -28, -122,   24, -106,   25,   88,   98,   32,   44,   67,   12,  -21,
              12,  -84,   51,   16, -106,   33, -126,  -48,   12,   17,    4,  103,    8,   38,   44,    2,
              99,  -95, -127,  -64,    8, -116, -123,    6,   66,   35,   48,   22,   26,    8, -114,  -64,
              88,  104,   80, -123, -115,  -51,  -82,  -51,   37, -115,  -84,  -52, -115,  110,   74,   16,
             -12,   24, -127, -109,   11,   59,  107,   11, -101,   50,   16, -121,   82,  103,   68,  110,
             -18,  -85,   12,   15,  -18,   77, -114,  -18,  -53,   46,   76,  110,   10,  -47,   64,   18,
              85,  104,   68,  110,  -18,  -21,   77,   76,  -83,  108, -116,  -18,  107, -114,  -19, -115,
             110,  110,   74,   96,  -11,   26, -111, -101,   -5,   42,  -61, -125,  123, -109,  -93,   -5,
              50,  123, -109,   43,   11,   27,   67,   -5,  114,   11,  107,   43, -101,   34,   96,   90,
             -91,   17,  -71,  -71,  -81,   50,   60,  -72,   55,   57,  -70,   47,  -77,   55,  -71,  -78,
             -80,   49,  -76,   41, -126,  -59,    1,    0,  121,   24,    0,    0,   92,    0,    0,    0,
              51,    8, -128,   28,  -60,  -31,   28,  102,   20,    1,   61, -120,   67,   56, -124,  -61,
            -116,   66, -128,    7,  121,  120,    7,  115, -104,  113,   12,  -26,    0,   15,  -19,   16,
              14,  -12, -128,   14,   51,   12,   66,   30,  -62,  -63,   29,  -50,  -95,   28,  102,   48,
               5,   61, -120,   67,   56, -124, -125,   27,  -52,    3,   61,  -56,   67,   61, -116,    3,
              61,  -52,  120, -116,  116,  112,    7,  123,    8,    7,  121,   72, -121,  112,  112,    7,
             122,  112,    3,  118,  120, -121,  112,   32, -121,   25,  -52,   17,   14,  -20, -112,   14,
             -31,   48,   15,  110,   48,   15,  -29,  -16,   14,  -16,   80,   14,   51,   16,  -60,   29,
             -34,   33,   28,  -40,   33,   29,  -62,   97,   30,  102,   48, -119,   59,  -68, -125,   59,
             -48,   67,   57,  -76,    3,   60,  -68, -125,   60, -124,    3,   59,  -52,  -16,   20,  118,
              96,    7,  123,  104,    7,   55,  104, -121,  114,  104,    7,   55, -128, -121,  112, -112,
            -121,  112,   96,    7,  118,   40,    7,  118,   -8,    5,  118,  120, -121,  119, -128, -121,
              95,    8, -121,  113,   24, -121,  114, -104, -121,  121, -104, -127,   44,  -18,  -16,   14,
             -18,  -32,   14,  -11,  -64,   14,  -20,   48,    3,   98,  -56,  -95,   28,  -28,  -95,   28,
             -52,  -95,   28,  -28,  -95,   28,  -36,   97,   28,  -54,   33,   28,  -60, -127,   29,  -54,
              97,    6,  -42, -112,   67,   57,  -56,   67,   57, -104,   67,   57,  -56,   67,   57,  -72,
             -61,   56, -108,   67,   56, -120,    3,   59, -108,  -61,   47,  -68, -125,   60,   -4, -126,
              59,  -44,    3,   59,  -80,  -61,   12,  -57,  105, -121,  112,   88, -121,  114,  112, -125,
             116,  104,    7,  120,   96, -121,  116,   24, -121,  116,  -96, -121,   25,  -50,   83,   15,
             -18,    0,   15,  -14,   80,   14,  -28, -112,   14,  -29,   64,   15,  -31,   32,   14,  -20,
              80,   14,   51,   32,   40,   29,  -36,  -63,   30,  -62,   65,   30,  -46,   33,   28,  -36,
            -127,   30,  -36,  -32,   28,  -28,  -31,   29,  -22,    1,   30,  102,   24,   81,   56,  -80,
              67,   58, -100, -125,   59,  -52,   80,   36,  118,   96,    7,  123,  104,    7,   55,   96,
            -121,  119,  120,    7,  120, -104,   81,   76,  -12, -112,   15,  -16,   80,   14,    0,    0,
             113,   32,    0,    0,   37,    0,    0,    0,   86, -128,   -4,  -13,  -51,    0,  -41,  113,
             -40,   65,  -74,   44,   21,  -29,   51,    4,   35,   60, -104,   -1,  -48,    8,  -17,   63,
              52,  -62,   -5, -120, -114,   91,  -64,   33,   77,   64,   52,   -3, -105,    9,   28,  -46,
               4,   68,  -45, -113,   25, -127,   34,   68,    4,   48,   17,   63,   51,    5,  102,  -96,
               6,   -1,  108,  -45, -111,  -60,   18, -109,  -73,   16,   12,  -47,   76,  -38,  -12,   83,
             -62,    1,   68,  -11,   29,   73,   63,  -80,   44, -114,    0,   76, -120,  -45,   28,   73,
              98,    0,   12,   67,   12,    8,  -48,   -4,   21,  -80,   80, -124,   33,   32,  126,   36,
              -7,  -61,  -28,   68,   54,  -96,   56,  -44,  -12,    7,  -56,  -60,    0, -113,   37, -124,
             -63,   63,  -41,  119,   36,  113,   11,    1,   68,  104, -112,   16,  -62, -108,  -42,  119,
              36,   -3,  -64,  -78,   56,    2,   48,   33,   78,    3,    0,    0,   97,   32,    0,    0,
              67,    0,    0,    0,   19,    4,   65,   44,   16,    0,    0,    0,    6,    0,    0,    0,
               4,   74,  -96,   20,   10, -126,   68,    9,   20,   65,    1,   81,   42,   -1,    0,  122,
              35,    0,  -28,  108,  -53,    0,    0,    0,   51,   17,    5,   48,   17,    7,  -35,   29,
              67,  -24, -106,   49, -124,  -50,   26,   49,   40, -118,  -96,  -16,  -66,   49, -124,  -18,
              26,   49,   40, -118,  -96,    0, -125,   48,   56,   49,    0,   65,  -64,   24,  110,   24,
               3,   50,   48,    3,   27,    3,   50,    8, -127, -111,  -63,   24, -124,   96,  -70,  -63,
              12,  -50,  -96,   12, -122,   27,  -48, -128,   66, -125,   43, -125,   36,  -45,   13, -103,
              26,  -92,    1,    5,  -93,   34,   54,    8,   18,   70,   73,  110,   16,  -57,  -71,   29,
              49,   64,    0,  -32, -128, -125,   13,  -85,  -76,   17, -125,  -61,    0,   12,  110,   13,
             -38,  -32,   13,   48,   28,    8,    0,    0,   21,    0,    0,    0,   54,   66,    8,   78,
              83,   89,   10,   33,   48,  -49,  110,   16,    9,  -46,   -8, -126,   67,   68,    2,   97,
              43, -126,  -17,   91,  -55,   32,   48, -113,  -99,   16,   18,   21,  -24,  102,   50,   72,
              84,   96,   45, -123,   68,    5,  -75,  109,   34, -123,    0,   44, -117,  109,   47, -123,
              68,    5,  -11,  109,   28,  -61,  -60,   60,  -90,   18,   -8, -122,   98,   12,   72,   81,
              -8,  -76,   69,    4, -105,   73,    4, -104, -127,   16,    2,  -80,   44,    0,    0,    0,
               1,   49,    0,    0,    5,    0,    0,    0,   91,    6,   36,   32, -125,   45,    3,   20,
            -112,  -63, -106,   65,   10,  -56,   96,  -53,   80,   21,  107,    0,    0,    0,    0,    0,
              97,   32,    0,    0,    3,    0,    0,    0,   19,    4,  -63, -120,    1,   97,    4,  -55,
            -128,    0,    0,    0,    0,    0,    0,    0,
        };
        return data;
    }

    private static int bitCode64Length = 1928;

    private static byte[] getBitCode64Internal() {
        byte[] bc = new byte[bitCode64Length];
        int offset = 0;
        byte[] seg;
        seg = getSegment64_0();
        System.arraycopy(seg, 0, bc, offset, seg.length);
        offset += seg.length;
        return bc;
    }

}
