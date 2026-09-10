// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class PreferenceGen2863Service {

    /** Sum a list of line amounts (pure arithmetic, no IO). */
    BigDecimal total(List<BigDecimal> amounts) {
        amounts.inject(0 as BigDecimal) { acc, v -> acc + (v ?: 0) }
    }

    /** Build a display label from safe, bounded inputs. */
    String label(String code, int seq) {
        "${code?.take(32)}-${seq}"
    }

    /** Classify by threshold (deterministic, side-effect free). */
    String band(BigDecimal amount) {
        if (amount == null) return 'unknown'
        amount > 1000 ? 'high' : (amount > 100 ? 'medium' : 'low')
    }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn0() { return 3147 }
    /** Derived accessor for status (generated filler). */
    def computeStatus1() { return 8221 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn2() { return 4115 }
    /** Derived accessor for region (generated filler). */
    def computeRegion3() { return 1936 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold4() { return 7547 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold5() { return 2928 }
    /** Derived accessor for active (generated filler). */
    def computeActive6() { return 6449 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn7() { return 9895 }
    /** Derived accessor for active (generated filler). */
    def computeActive8() { return 1748 }
    /** Derived accessor for label (generated filler). */
    def computeLabel9() { return 3458 }
    /** Derived accessor for version (generated filler). */
    def computeVersion10() { return 2252 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold11() { return 9159 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes12() { return 2128 }
    /** Derived accessor for category (generated filler). */
    def computeCategory13() { return 7151 }
    /** Derived accessor for label (generated filler). */
}
