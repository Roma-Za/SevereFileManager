package com.roman.zapriy.severefilemanager;

import java.util.HashMap;
import java.util.Map;

public class MimeTypeUtils {
    private static Map<String, String> mimeTypes;
    static {
        mimeTypes = new HashMap<>();
        mimeTypes.put("ez", "application/andrew-inset");
        mimeTypes.put("tsp", "application/dsptype");
        mimeTypes.put("epub", "application/epub+zip");
        mimeTypes.put("hta", "application/hta");
        mimeTypes.put("hqx", "application/mac-binhex40");
        mimeTypes.put("nb", "application/mathematica");
        mimeTypes.put("mdb", "application/msaccess");
        mimeTypes.put("oda", "application/oda");
        mimeTypes.put("ogg", "application/ogg");
        mimeTypes.put("oga", "application/ogg");
        mimeTypes.put("pdf", "application/pdf");
        mimeTypes.put("key", "application/pgp-keys");
        mimeTypes.put("pgp", "application/pgp-signature");
        mimeTypes.put("prf", "application/pics-rules");
        mimeTypes.put("cer", "application/pkix-cert");
        mimeTypes.put("rar", "application/rar");
        mimeTypes.put("rdf", "application/rdf+xml");
        mimeTypes.put("rss", "application/rss+xml");
        mimeTypes.put("zip", "application/zip");
        mimeTypes.put("apk", "application/vnd.android.package-archive");
        mimeTypes.put("cdy", "application/vnd.cinderella");
        mimeTypes.put("stl", "application/vnd.ms-pki.stl");
        mimeTypes.put("odb", "application/vnd.oasis.opendocument.database");
        mimeTypes.put("odf", "application/vnd.oasis.opendocument.formula");
        mimeTypes.put("odg", "application/vnd.oasis.opendocument.graphics");
        mimeTypes.put("otg", "application/vnd.oasis.opendocument.graphics-template");
        mimeTypes.put("odi", "application/vnd.oasis.opendocument.image");
        mimeTypes.put("odp", "application/vnd.oasis.opendocument.presentation");
        mimeTypes.put("otp", "application/vnd.oasis.opendocument.presentation-template");
        mimeTypes.put("ods", "application/vnd.oasis.opendocument.spreadsheet");
        mimeTypes.put("ots", "application/vnd.oasis.opendocument.spreadsheet-template");
        mimeTypes.put("odt", "application/vnd.oasis.opendocument.text");
        mimeTypes.put("odm", "application/vnd.oasis.opendocument.text-master");
        mimeTypes.put("ott", "application/vnd.oasis.opendocument.text-template");
        mimeTypes.put("oth", "application/vnd.oasis.opendocument.text-web");
        mimeTypes.put("kml", "application/vnd.google-earth.kml+xml");
        mimeTypes.put("kmz", "application/vnd.google-earth.kmz");
        mimeTypes.put("doc", "application/msword");
        mimeTypes.put("dot", "application/msword");
        mimeTypes.put("docx", "application/vnd.openxmlformats-officedocument.wordprocessingml.document");
        mimeTypes.put("dotx", "application/vnd.openxmlformats-officedocument.wordprocessingml.template");
        mimeTypes.put("xls", "application/vnd.ms-excel");
        mimeTypes.put("xlt", "application/vnd.ms-excel");
        mimeTypes.put("xlsx", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        mimeTypes.put("xltx", "application/vnd.openxmlformats-officedocument.spreadsheetml.template");
        mimeTypes.put("ppt", "application/vnd.ms-powerpoint");
        mimeTypes.put("pot", "application/vnd.ms-powerpoint");
        mimeTypes.put("pps", "application/vnd.ms-powerpoint");
        mimeTypes.put("pptx", "application/vnd.openxmlformats-officedocument.presentationml.presentation");
        mimeTypes.put("potx", "application/vnd.openxmlformats-officedocument.presentationml.template");
        mimeTypes.put("ppsx", "application/vnd.openxmlformats-officedocument.presentationml.slideshow");
        mimeTypes.put("cod", "application/vnd.rim.cod");
        mimeTypes.put("mmf", "application/vnd.smaf");
        mimeTypes.put("sdc", "application/vnd.stardivision.calc");
        mimeTypes.put("sda", "application/vnd.stardivision.draw");
        mimeTypes.put("sdd", "application/vnd.stardivision.impress");
        mimeTypes.put("sdp", "application/vnd.stardivision.impress");
        mimeTypes.put("smf", "application/vnd.stardivision.math");
        mimeTypes.put("sdw", "application/vnd.stardivision.writer");
        mimeTypes.put("vor", "application/vnd.stardivision.writer");
        mimeTypes.put("sgl", "application/vnd.stardivision.writer-global");
        mimeTypes.put("sxc", "application/vnd.sun.xml.calc");
        mimeTypes.put("stc", "application/vnd.sun.xml.calc.template");
        mimeTypes.put("sxd", "application/vnd.sun.xml.draw");
        mimeTypes.put("std", "application/vnd.sun.xml.draw.template");
        mimeTypes.put("sxi", "application/vnd.sun.xml.impress");
        mimeTypes.put("sti", "application/vnd.sun.xml.impress.template");
        mimeTypes.put("sxm", "application/vnd.sun.xml.math");
        mimeTypes.put("sxw", "application/vnd.sun.xml.writer");
        mimeTypes.put("sxg", "application/vnd.sun.xml.writer.global");
        mimeTypes.put("stw", "application/vnd.sun.xml.writer.template");
        mimeTypes.put("vsd", "application/vnd.visio");
        mimeTypes.put("abw", "application/x-abiword");
        mimeTypes.put("dmg", "application/x-apple-diskimage");
        mimeTypes.put("bcpio", "application/x-bcpio");
        mimeTypes.put("torrent", "application/x-bittorrent");
        mimeTypes.put("cdf", "application/x-cdf");
        mimeTypes.put("vcd", "application/x-cdlink");
        mimeTypes.put("pgn", "application/x-chess-pgn");
        mimeTypes.put("cpio", "application/x-cpio");
        mimeTypes.put("deb", "application/x-debian-package");
        mimeTypes.put("udeb", "application/x-debian-package");
        mimeTypes.put("dcr", "application/x-director");
        mimeTypes.put("dir", "application/x-director");
        mimeTypes.put("dxr", "application/x-director");
        mimeTypes.put("dms", "application/x-dms");
        mimeTypes.put("wad", "application/x-doom");
        mimeTypes.put("dvi", "application/x-dvi");
        mimeTypes.put("pfa", "application/x-font");
        mimeTypes.put("pfb", "application/x-font");
        mimeTypes.put("gsf", "application/x-font");
        mimeTypes.put("pcf", "application/x-font");
        mimeTypes.put("pcf.Z", "application/x-font");
        mimeTypes.put("mm", "application/x-freemind");
        mimeTypes.put("spl", "application/x-futuresplash");
        mimeTypes.put("spl", "application/futuresplash");
        mimeTypes.put("gnumeric", "application/x-gnumeric");
        mimeTypes.put("sgf", "application/x-go-sgf");
        mimeTypes.put("gcf", "application/x-graphing-calculator");
        mimeTypes.put("tgz", "application/x-gtar");
        mimeTypes.put("gtar", "application/x-gtar");
        mimeTypes.put("taz", "application/x-gtar");
        mimeTypes.put("hdf", "application/x-hdf");
        mimeTypes.put("hwp", "application/x-hdf");
        mimeTypes.put("ica", "application/x-ica");
        mimeTypes.put("ins", "application/x-internet-signup");
        mimeTypes.put("isp", "application/x-internet-signup");
        mimeTypes.put("iii", "application/x-iphone");
        mimeTypes.put("iso", "application/x-iso9660-image");
        mimeTypes.put("jmz", "application/x-jmol");
        mimeTypes.put("chrt", "application/x-kchart");
        mimeTypes.put("kil", "application/x-killustrator");
        mimeTypes.put("skp", "application/x-koan");
        mimeTypes.put("skd", "application/x-koan");
        mimeTypes.put("skt", "application/x-koan");
        mimeTypes.put("skm", "application/x-koan");
        mimeTypes.put("kpr", "application/x-kpresenter");
        mimeTypes.put("kpt", "application/x-kpresenter");
        mimeTypes.put("ksp", "application/x-kspread");
        mimeTypes.put("kwd", "application/x-kword");
        mimeTypes.put("kwt", "application/x-kword");
        mimeTypes.put("latex", "application/x-latex");
        mimeTypes.put("lha", "application/x-lha");
        mimeTypes.put("lzh", "application/x-lzh");
        mimeTypes.put("lzx", "application/x-lzx");
        mimeTypes.put("frm", "application/x-maker");
        mimeTypes.put("maker", "application/x-maker");
        mimeTypes.put("frame", "application/x-maker");
        mimeTypes.put("fb", "application/x-maker");
        mimeTypes.put("book", "application/x-maker");
        mimeTypes.put("fbdoc", "application/x-maker");
        mimeTypes.put("mif", "application/x-mif");
        mimeTypes.put("wmd", "application/x-ms-wmd");
        mimeTypes.put("wmz", "application/x-ms-wmz");
        mimeTypes.put("msi", "application/x-msi");
        mimeTypes.put("pac", "application/x-ns-proxy-autoconfig");
        mimeTypes.put("nwc", "application/x-nwc");
        mimeTypes.put("o", "application/x-object");
        mimeTypes.put("oza", "application/x-oz-application");
        mimeTypes.put("pem", "application/x-pem-file");
        mimeTypes.put("p12", "application/x-pkcs12");
        mimeTypes.put("pfx", "application/x-pkcs12");
        mimeTypes.put("p7r", "application/x-pkcs7-certreqresp");
        mimeTypes.put("crl", "application/x-pkcs7-crl");
        mimeTypes.put("qtl", "application/x-quicktimeplayer");
        mimeTypes.put("shar", "application/x-shar");
        mimeTypes.put("swf", "application/x-shockwave-flash");
        mimeTypes.put("sit", "application/x-stuffit");
        mimeTypes.put("sv4cpio", "application/x-sv4cpio");
        mimeTypes.put("sv4crc", "application/x-sv4crc");
        mimeTypes.put("tar", "application/x-tar");
        mimeTypes.put("texinfo", "application/x-texinfo");
        mimeTypes.put("texi", "application/x-texinfo");
        mimeTypes.put("t", "application/x-troff");
        mimeTypes.put("roff", "application/x-troff");
        mimeTypes.put("man", "application/x-troff-man");
        mimeTypes.put("ustar", "application/x-ustar");
        mimeTypes.put("src", "application/x-wais-source");
        mimeTypes.put("wz", "application/x-wingz");
        mimeTypes.put("webarchive", "application/x-webarchive");
        mimeTypes.put("webarchivexml", "application/x-webarchive-xml");
        mimeTypes.put("crt", "application/x-x509-ca-cert");
        mimeTypes.put("crt", "application/x-x509-user-cert");
        mimeTypes.put("crt", "application/x-x509-server-cert");
        mimeTypes.put("xcf", "application/x-xcf");
        mimeTypes.put("fig", "application/x-xfig");
        mimeTypes.put("xhtml", "application/xhtml+xml");
        mimeTypes.put("3gpp", "video/3gpp");
        mimeTypes.put("3gp", "video/3gpp");
        mimeTypes.put("3gpp2", "video/3gpp2");
        mimeTypes.put("3g2", "video/3gpp2");
        mimeTypes.put("3gpp", "audio/3gpp");
        mimeTypes.put("aac", "audio/aac");
        mimeTypes.put("aac", "audio/aac-adts");
        mimeTypes.put("amr", "audio/amr");
        mimeTypes.put("awb", "audio/amr-wb");
        mimeTypes.put("snd", "audio/basic");
        mimeTypes.put("flac", "audio/flac");
        mimeTypes.put("flac", "application/x-flac");
        mimeTypes.put("imy", "audio/imelody");
        mimeTypes.put("mid", "audio/midi");
        mimeTypes.put("midi", "audio/midi");
        mimeTypes.put("ota", "audio/midi");
        mimeTypes.put("kar", "audio/midi");
        mimeTypes.put("rtttl", "audio/midi");
        mimeTypes.put("xmf", "audio/midi");
        mimeTypes.put("mxmf", "audio/mobile-xmf");
        mimeTypes.put("mp3", "audio/mpeg");
        mimeTypes.put("mpga", "audio/mpeg");
        mimeTypes.put("mpega", "audio/mpeg");
        mimeTypes.put("mp2", "audio/mpeg");
        mimeTypes.put("m4a", "audio/mpeg");
        mimeTypes.put("m3u", "audio/mpegurl");
        mimeTypes.put("sid", "audio/prs.sid");
        mimeTypes.put("aif", "audio/x-aiff");
        mimeTypes.put("aiff", "audio/x-aiff");
        mimeTypes.put("aifc", "audio/x-aiff");
        mimeTypes.put("gsm", "audio/x-gsm");
        mimeTypes.put("mka", "audio/x-matroska");
        mimeTypes.put("m3u", "audio/x-mpegurl");
        mimeTypes.put("wma", "audio/x-ms-wma");
        mimeTypes.put("wax", "audio/x-ms-wax");
        mimeTypes.put("ra", "audio/x-pn-realaudio");
        mimeTypes.put("rm", "audio/x-pn-realaudio");
        mimeTypes.put("ram", "audio/x-pn-realaudio");
        mimeTypes.put("ra", "audio/x-realaudio");
        mimeTypes.put("pls", "audio/x-scpls");
        mimeTypes.put("sd2", "audio/x-sd2");
        mimeTypes.put("wav", "audio/x-wav");
        mimeTypes.put("bmp", "image/x-ms-bmp");
        mimeTypes.put("bmp", "image/bmp");
        mimeTypes.put("gif", "image/gif");
        mimeTypes.put("ico", "image/x-icon");
        mimeTypes.put("cur", "image/ico");
        mimeTypes.put("ico", "image/ico");
        mimeTypes.put("ief", "image/ief");
        mimeTypes.put("jpg", "image/jpeg");
        mimeTypes.put("jpeg", "image/jpeg");
        mimeTypes.put("jpe", "image/jpeg");
        mimeTypes.put("pcx", "image/pcx");
        mimeTypes.put("png", "image/png");
        mimeTypes.put("svg", "image/svg+xml");
        mimeTypes.put("svgz", "image/svg+xml");
        mimeTypes.put("tiff", "image/tiff");
        mimeTypes.put("tif", "image/tiff");
        mimeTypes.put("djvu", "image/vnd.djvu");
        mimeTypes.put("djv", "image/vnd.djvu");
        mimeTypes.put("wbmp", "image/vnd.wap.wbmp");
        mimeTypes.put("webp", "image/webp");
        mimeTypes.put("dng", "image/x-adobe-dng");
        mimeTypes.put("cr2", "image/x-canon-cr2");
        mimeTypes.put("ras", "image/x-cmu-raster");
        mimeTypes.put("cdr", "image/x-coreldraw");
        mimeTypes.put("pat", "image/x-coreldrawpattern");
        mimeTypes.put("cdt", "image/x-coreldrawtemplate");
        mimeTypes.put("cpt", "image/x-corelphotopaint");
        mimeTypes.put("raf", "image/x-fuji-raf");
        mimeTypes.put("art", "image/x-jg");
        mimeTypes.put("jng", "image/x-jng");
        mimeTypes.put("nef", "image/x-nikon-nef");
        mimeTypes.put("nrw", "image/x-nikon-nrw");
        mimeTypes.put("orf", "image/x-olympus-orf");
        mimeTypes.put("rw2", "image/x-panasonic-rw2");
        mimeTypes.put("pef", "image/x-pentax-pef");
        mimeTypes.put("psd", "image/x-photoshop");
        mimeTypes.put("pnm", "image/x-portable-anymap");
        mimeTypes.put("pbm", "image/x-portable-bitmap");
        mimeTypes.put("pgm", "image/x-portable-graymap");
        mimeTypes.put("ppm", "image/x-portable-pixmap");
        mimeTypes.put("srw", "image/x-samsung-srw");
        mimeTypes.put("arw", "image/x-sony-arw");
        mimeTypes.put("rgb", "image/x-rgb");
        mimeTypes.put("xbm", "image/x-xbitmap");
        mimeTypes.put("xpm", "image/x-xpixmap");
        mimeTypes.put("xwd", "image/x-xwindowdump");
        mimeTypes.put("igs", "model/iges");
        mimeTypes.put("iges", "model/iges");
        mimeTypes.put("msh", "model/mesh");
        mimeTypes.put("mesh", "model/mesh");
        mimeTypes.put("silo", "model/mesh");
        mimeTypes.put("ics", "text/calendar");
        mimeTypes.put("icz", "text/calendar");
        mimeTypes.put("csv", "text/comma-separated-values");
        mimeTypes.put("css", "text/css");
        mimeTypes.put("htm", "text/html");
        mimeTypes.put("html", "text/html");
        mimeTypes.put("323", "text/h323");
        mimeTypes.put("uls", "text/iuls");
        mimeTypes.put("mml", "text/mathml");
        mimeTypes.put("txt", "text/plain");
        mimeTypes.put("asc", "text/plain");
        mimeTypes.put("text", "text/plain");
        mimeTypes.put("diff", "text/plain");
        mimeTypes.put("po", "text/plain");
        mimeTypes.put("rtx", "text/richtext");
        mimeTypes.put("rtf", "text/rtf");
        mimeTypes.put("phps", "text/text");
        mimeTypes.put("tsv", "text/tab-separated-values");
        mimeTypes.put("xml", "text/xml");
        mimeTypes.put("bib", "text/x-bibtex");
        mimeTypes.put("boo", "text/x-boo");
        mimeTypes.put("hpp", "text/x-c++hdr");
        mimeTypes.put("h++", "text/x-c++hdr");
        mimeTypes.put("hxx", "text/x-c++hdr");
        mimeTypes.put("hh", "text/x-c++hdr");
        mimeTypes.put("cpp", "text/x-c++src");
        mimeTypes.put("c++", "text/x-c++src");
        mimeTypes.put("cc", "text/x-c++src");
        mimeTypes.put("cxx", "text/x-c++src");
        mimeTypes.put("h", "text/x-chdr");
        mimeTypes.put("htc", "text/x-component");
        mimeTypes.put("csh", "text/x-csh");
        mimeTypes.put("c", "text/x-csrc");
        mimeTypes.put("d", "text/x-dsrc");
        mimeTypes.put("hs", "text/x-haskell");
        mimeTypes.put("java", "text/x-java");
        mimeTypes.put("lhs", "text/x-literate-haskell");
        mimeTypes.put("moc", "text/x-moc");
        mimeTypes.put("p", "text/x-pascal");
        mimeTypes.put("pas", "text/x-pascal");
        mimeTypes.put("gcd", "text/x-pcs-gcd");
        mimeTypes.put("etx", "text/x-setext");
        mimeTypes.put("tcl", "text/x-tcl");
        mimeTypes.put("tex", "text/x-tex");
        mimeTypes.put("ltx", "text/x-tex");
        mimeTypes.put("sty", "text/x-tex");
        mimeTypes.put("cls", "text/x-tex");
        mimeTypes.put("vcs", "text/x-vcalendar");
        mimeTypes.put("vcf", "text/x-vcard");
        mimeTypes.put("avi", "video/avi");
        mimeTypes.put("dl", "video/dl");
        mimeTypes.put("dif", "video/dv");
        mimeTypes.put("dv", "video/dv");
        mimeTypes.put("fli", "video/fli");
        mimeTypes.put("m4v", "video/m4v");
        mimeTypes.put("ts", "video/mp2ts");
        mimeTypes.put("mpeg", "video/mpeg");
        mimeTypes.put("mpg", "video/mpeg");
        mimeTypes.put("mpe", "video/mpeg");
        mimeTypes.put("mp4", "video/mp4");
        mimeTypes.put("VOB", "video/mpeg");
        mimeTypes.put("qt", "video/quicktime");
        mimeTypes.put("mov", "video/quicktime");
        mimeTypes.put("mxu", "video/vnd.mpegurl");
        mimeTypes.put("webm", "video/webm");
        mimeTypes.put("lsf", "video/x-la-asf");
        mimeTypes.put("lsx", "video/x-la-asf");
        mimeTypes.put("mkv", "video/x-matroska");
        mimeTypes.put("mng", "video/x-mng");
        mimeTypes.put("asf", "video/x-ms-asf");
        mimeTypes.put("asx", "video/x-ms-asf");
        mimeTypes.put("wm", "video/x-ms-wm");
        mimeTypes.put("wmv", "video/x-ms-wmv");
        mimeTypes.put("wmx", "video/x-ms-wmx");
        mimeTypes.put("wvx", "video/x-ms-wvx");
        mimeTypes.put("movie", "video/x-sgi-movie");
        mimeTypes.put("wrf", "video/x-webex");
        mimeTypes.put("ice", "x-conference/x-cooltalk");
        mimeTypes.put("sisx", "x-epoc/x-sisx-app");
    }

    public static String getMimeTypeForExtension(String ext) {
        return mimeTypes.get(ext);
    }
}
